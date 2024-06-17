import java.awt.Color;//for setting the color;
import javax.swing.ImageIcon;//for setting the logo
import javax.swing.JFrame;//for creating the jframe
public class FirstJFrame{
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setVisible(true);//for displaying the frame

        frame.setSize(500,500);//for setting up the size

        frame.setTitle("My First Jframe is here"); // For title of the jframe

        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);//prventing it from the running in background
        
        // frame.setResizable(false);//prevents the frame from resizing

        ImageIcon image = new ImageIcon("myLogo.jpeg");

        frame.setIconImage(image.getImage());

        frame.getContentPane().setBackground(Color.CYAN);

        // frame.getContentPane().setBackground(new Color(0,0,0)); for setting up your own background color
        // frame.getContentPane().setBackground(new Color(ox123456)); for setting up your own background color in hexadecimal values



    }
}