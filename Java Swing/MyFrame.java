import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
public class MyFrame extends JFrame {
    MyFrame(){
        //my all default properties
        
        setVisible(true);//for displaying the frame

        setSize(500,500);//for setting up the size

        setTitle("Edit-the-title"); // For title of the jframe

        setDefaultCloseOperation(EXIT_ON_CLOSE);//prventing it from the running in background
        
        // frame.setResizable(false);//prevents the frame from resizing

        this.getContentPane().setBackground(Color.BLACK);

        ImageIcon image = new ImageIcon("myLogo.jpeg");

        setIconImage(image.getImage());

    }
    public static void main(String[] args) {
        
    }
}
