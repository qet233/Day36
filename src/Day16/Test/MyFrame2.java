package Day16.Test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MyFrame2 extends JFrame implements ActionListener{
    JButton jbt1 = new JButton("按钮1");
    JButton jbt2 = new JButton("按钮2");
    MyFrame2(){
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

        jbt1.addActionListener(this);
        jbt2.addActionListener(this);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source==jbt1){
            jbt1.setSize(200,200);
        } else if (source==jbt2) {
            Random r = new Random();
            jbt2.setLocation(r.nextInt(500),r.nextInt(500));
        }
    }
}
