package Day16;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener,ActionListener{
    int[][] data = new int[4][4];
    int x,y=0;
    int[][] win = new int[][]{{1, 5, 9, 13}, {2, 6, 10, 14}, {3, 7, 11, 15}, {4, 8, 12, 16}};
    int step=0;
    JMenuItem jMenuItem1 = new JMenuItem("重新游戏");
    JMenuItem jMenuItem2 = new JMenuItem("重新登录");
    JMenuItem jMenuItem3 = new JMenuItem("关闭游戏");
    JMenuItem jMenuItem4 = new JMenuItem("公众号");
    public GameJFrame() {
        //初始化界面
        init();

        //初始化菜单
        initJMenuBar();

        //初始化数据
        initData();

        //初始化图片
        initImage();

        //显示窗口
        this.setVisible(true);
    }

    private void initData() {
        int [] tempArr={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        Random r = new Random();
        for (int i = 0; i < tempArr.length; i++) {
            int index = r.nextInt(tempArr.length);
            int temp = tempArr[i];
            tempArr[i]=tempArr[index];
            tempArr[index]=temp;
        }
        for (int i = 0; i < tempArr.length; i++) {
            data[i/4][i%4]=tempArr[i];
            if(tempArr[i]==16){
                x=i/4;
                y=i%4;
            }
        }
    }

    private void initImage() {
        //去掉所有照片
        this.getContentPane().removeAll();

        if(victory()){
            JLabel victoryJLabel = new JLabel(new ImageIcon("src\\Day16\\image\\win.png"));
            victoryJLabel.setBounds(203,283,197,73);
            this.getContentPane().add(victoryJLabel);
        }
        JLabel stepCount=new JLabel("步数"+step);
        stepCount.setBounds(50,30,100,20);
        this.getContentPane().add(stepCount);
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                ImageIcon icon = new ImageIcon("src\\Day16\\image\\animal\\animal3\\" + data[i][j]+ ".jpg");
                JLabel jLabel = new JLabel(icon);
                jLabel.setBounds(i * 105+83, 105 * j+134, 105, 105);
                jLabel.setBorder(new BevelBorder(BevelBorder.LOWERED));
                this.getContentPane().add(jLabel);
            }
        }
        //添加背景
        JLabel background= new JLabel(new ImageIcon("src\\Day16\\image\\background.png"));
        background.setBounds(40,40,508,560);
        this.getContentPane().add(background);

        this.getContentPane().repaint();
    }

    public void init() {
        this.setSize(603, 680);
        this.setTitle("测试-游戏");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //取消默认的居中放置
        this.setLayout(null);
        //添加键盘监听事件
        this.addKeyListener(this);
    }

    public void initJMenuBar() {
        //初始化菜单
        JMenuBar jMenuBar = new JMenuBar();
        jMenuBar.setSize(514, 20);
        JMenu jMenu1 = new JMenu("功能");
        JMenu jMenu2 = new JMenu("关于我们");
        jMenu1.add(jMenuItem1);
        jMenu1.add(jMenuItem2);
        jMenu1.add(jMenuItem3);
        jMenu2.add(jMenuItem4);
        jMenuBar.add(jMenu1);
        jMenuBar.add(jMenu2);
        jMenuItem1.addActionListener(this);
        jMenuItem2.addActionListener(this);
        jMenuItem3.addActionListener(this);
        jMenuItem4.addActionListener(this);
        this.setJMenuBar(jMenuBar);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        //按a查看正确的图片
        if(code==65){
            this.getContentPane().removeAll();
            ImageIcon all= new ImageIcon("src\\Day16\\image\\animal\\animal3\\all.jpg");
            JLabel allJLabel= new JLabel(all);
            allJLabel.setBounds(83,134,420,420);
            JLabel background= new JLabel(new ImageIcon("src\\Day16\\image\\background.png"));
            background.setBounds(40,40,508,560);
            this.getContentPane().add(allJLabel);
            this.getContentPane().add(background);
            this.getContentPane().repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //对上，下，左，右进行判断
        //左：37 上：38 右：39 下：40
        if(victory()){
            return;
        }
        int code = e.getKeyCode();
        System.out.println(code);
        if (code==37&&x!=3){
            data[x][y]=data[x+1][y];
            data[x+1][y]=16;
            x++;
            step++;
            initImage();
        } else if (code==38&&y!=3){
            data[x][y]=data[x][y+1];
            data[x][y+1]=16;
            y++;
            step++;
            initImage();
        } else if (code==39&&x!=0){
            data[x][y]=data[x-1][y];
            data[x-1][y]=16;
            x--;
            step++;
            initImage();
        } else if (code==40&&y!=0){
            data[x][y]=data[x][y-1];
            data[x][y-1]=16;
            y--;
            step++;
            initImage();
        } else if (code==65){
            initImage();
        } else if (code==87){
            //按w一键通关
            data= new int[][]{{1, 5, 9, 13}, {2, 6, 10, 14}, {3, 7, 11, 16}, {4, 8, 12, 15}};
            x=2;
            y=3;
            initImage();
        }


    }
    //判断是否胜利
    public boolean victory(){
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if(data[i][j]!=win[i][j]){
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source==jMenuItem3){
            System.exit(0);
        } else if (source==jMenuItem4){
            JDialog jDialog=new JDialog();
            JLabel jLabel= new JLabel(new ImageIcon("src\\Day16\\image\\about.png"));
            jLabel.setBounds(0,0,258,258);
            jDialog.getContentPane().add(jLabel);
            jDialog.setSize(340,340);
            jDialog.setAlwaysOnTop(true);
            jDialog.setLocationRelativeTo(null);
            jDialog.setModal(true);
            jDialog.setVisible(true);
        } else if (source==jMenuItem1){
            step=0;
            initData();
            initImage();
        } else if (source==jMenuItem2){
            this.setVisible(false);
            new LoginJFrame();
        }
    }
}

