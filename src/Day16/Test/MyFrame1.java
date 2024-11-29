package Day16.Test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame1 extends JFrame {
    JButton jbt1 = new JButton("按钮1");
    JButton jbt2 = new JButton("按钮2");
    MyFrame1(){
        this.setSize(500,500);
        this.setTitle("Title");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);

        jbt1.setBounds(0,0,100,50);
        jbt2.setBounds(100,0,100,50);
        this.getContentPane().add(jbt1);
        this.getContentPane().add(jbt2);

        jbt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("点我jbt1");
            }
        });
        jbt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("点我jbt2");
            }
        });
        this.setVisible(true);
    }
}
