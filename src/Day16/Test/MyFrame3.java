package Day16.Test;

import javax.swing.*;
import java.awt.event.*;
import java.util.Random;

public class MyFrame3 extends JFrame implements MouseListener, KeyListener {
    JButton jbt1 = new JButton("按钮1");
    JButton jbt2 = new JButton("按钮2");
    MyFrame3(){
        this.setSize(500,500);
        this.setTitle("Title");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);

        this.addKeyListener(this);

//        jbt1.setBounds(0,0,100,50);
//        jbt2.setBounds(100,0,100,50);
//        this.getContentPane().add(jbt1);
//        this.getContentPane().add(jbt2);

//        jbt1.addMouseListener(this);
//        jbt2.addMouseListener(this);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("单击");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("按下不松");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("释放");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("划入");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("划出");
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("按下不送");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("松开按键");
        int keyCode = e.getKeyCode();
        System.out.println(keyCode);
    }
}