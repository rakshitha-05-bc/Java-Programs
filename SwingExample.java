package Swings;
import javax.swing.*;
import java.awt.*;
class SwingExample{
SwingExample(){
JFrame jfrm=new JFrame("A Simple Swing Application");
jfrm.setSize(700,200);
jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JLabel jlab=new JLabel("Hello! VI C, Welcome to Swing Programming");
jlab.setFont(new Font("Verdana",Font.PLAIN,32));
jlab.setForeground(Color.BLUE);
jlab.setHorizontalAlignment(JLabel.CENTER);
jfrm.add(jlab);
jfrm.setVisible(true);
}
public static void main(String args[]){
new SwingExample();
}
}


