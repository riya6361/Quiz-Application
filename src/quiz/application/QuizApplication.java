package quiz.application;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class QuizApplication extends JFrame implements ActionListener {
    JButton b1,b2;
    JTextField t1;
    QuizApplication(){
        setBounds(400,200,1200,500); 
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("quiz/application/icons/quiz (1).jpg"));//to fetch image
        JLabel l1 = new JLabel(il);//to display image
        l1.setBounds(0,0,600,500);
        add(l1);
        
        JLabel l2 = new JLabel("Simple Minds");
        l2.setFont(new Font("Mongolian Baiti",Font.BOLD,40));
        l2.setForeground(Color.BLUE);
        l2.setBounds(750,60,300,45);
        add(l2);
        
        JLabel l3 = new JLabel("Enter Your Name");
        l3.setFont(new Font("Mongolian Baiti",Font.BOLD,20));
        l3.setForeground(Color.BLUE);
        l3.setBounds(800,150,300,20);
        add(l3);
        
         t1 = new JTextField();
        t1.setBounds(735,200,300,25);
         t1.setFont(new Font("Times New Roman",Font.BOLD,18));
        add(t1);
        
         b1 = new JButton("Rules");
        b1.setBounds(735, 270, 120, 25);
        b1.setBackground(new Color(30,144,254));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);
        
         b2 = new JButton("Exit");
        b2.setBounds(915, 270, 120, 25);
         b2.setBackground(new Color(30,144,254));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);
        
        
      setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            String name = t1.getText();
            this.setVisible(false);
            new Rules(name);
        } else {
            System.exit(0);
        }
    }
    public static void main(String[] args){
        new QuizApplication();
    }
}


