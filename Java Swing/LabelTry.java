import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.*;

public class LabelTry {
public static void main(String[] args) {
    
    
    JLabel label = new JLabel();
    label.setText("Hello, This Is DCodeVerse");
    label.setForeground(Color.CYAN);
    ImageIcon image = new ImageIcon("myLogo.jpeg");
    label.setIcon(image);
    label.setHorizontalTextPosition(JLabel.CENTER);
    label.setVerticalTextPosition(JLabel.TOP);
    label.setFont(new Font("Mv Boli",Font.BOLD,40));
    label.setIconTextGap(30);

    JFrame frame = new JFrame();
    frame.setVisible(true);
    frame.setTitle("LabelTry");
    frame.setSize(400,400);
    frame.setIconImage(image.getImage());
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().setBackground(Color.BLACK);
    frame.add(label);

    

}    
}
