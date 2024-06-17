import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Label {
    public static void main(String[] args) {
        

        JFrame frame = new JFrame();
        JLabel label = new JLabel();

        ImageIcon image = new ImageIcon("myLogo.jpeg");
        label.setIcon(image);

        label.setBackground(Color.yellow);

   

        label.setText("Hello from DCodeVerse");
        label.setHorizontalTextPosition(JLabel.RIGHT); 
        //for setting the up text positon horizontally.
        label.setVerticalTextPosition(JLabel.TOP);//for vertical text position

        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setSize(600,600);
        frame.getContentPane().setBackground(Color.CYAN);
        frame.add(label);

    }
}
