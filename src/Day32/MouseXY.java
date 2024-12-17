package Day32;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Point;
import java.awt.Robot;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.Color;

public class MouseXY extends JFrame {

    private final JPanel contentPanel = new JPanel();
    JLabel value_x = null;
    JLabel value_y = null;
    JLabel value_rgb =null;


    public static void main(String[] args) {
        try {
            MouseXY info_frame = new MouseXY();
            info_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            info_frame.setVisible(true);
            info_frame.setAlwaysOnTop(true);
            Robot robot = new Robot();

            Timer timer = new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    Point point = java.awt.MouseInfo.getPointerInfo().getLocation();
                    Color c = robot.getPixelColor(point.x,point.y );
//           System.out.println("Location:x=" + point.x + ", y=" +  point.y);

                    info_frame.value_x.setText("" + point.x);
                    info_frame.value_y.setText("" + point.y);
                    info_frame.value_rgb.setText(c.getRed()+","+c.getGreen()+","+c.getBlue());
                }
            }, 100, 100);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public MouseXY() {
        setTitle("鼠标位置");
        setBounds(100, 100, 217, 200);
        getContentPane().setLayout(new BorderLayout());
        contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        getContentPane().add(contentPanel, BorderLayout.CENTER);
        contentPanel.setLayout(null);

        JLabel lblx = new JLabel("坐标x:");
        lblx.setFont(new Font("宋体", Font.PLAIN, 15));
        lblx.setBounds(22, 27, 66, 31);
        contentPanel.add(lblx);

        JLabel lbly = new JLabel("坐标y:");
        lbly.setFont(new Font("宋体", Font.PLAIN, 15));
        lbly.setBounds(22, 68, 66, 31);
        contentPanel.add(lbly);

        JLabel lrgb = new JLabel("颜色:");
        lrgb.setFont(new Font("宋体", Font.PLAIN, 15));
        lrgb.setBounds(22, 109, 66, 31);
        contentPanel.add(lrgb);

        value_x = new JLabel("0");
        value_x.setForeground(Color.BLUE);
        value_x.setFont(new Font("宋体", Font.PLAIN, 20));
        value_x.setBounds(82, 27, 66, 31);
        contentPanel.add(value_x);

        value_y = new JLabel("0");
        value_y.setForeground(Color.BLUE);
        value_y.setFont(new Font("宋体", Font.PLAIN, 20));
        value_y.setBounds(82, 68, 66, 31);
        contentPanel.add(value_y);

        value_rgb = new JLabel("0");
        value_rgb.setForeground(Color.BLUE);
        value_rgb.setFont(new Font("宋体", Font.PLAIN, 16));
        value_rgb.setBounds(82, 109, 100, 31);
        contentPanel.add(value_rgb);
    }
}

