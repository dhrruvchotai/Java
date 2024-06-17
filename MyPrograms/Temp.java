import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Temp extends JFrame implements ActionListener {
    private JLabel instructionsLabel;
    private JTextField guessField;
    private JButton submitButton;
    private JLabel resultLabel;

    private int randomNumber;

    public Temp() {
        setTitle("Guessing Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        instructionsLabel = new JLabel("Guess a number between 1 and 100:");
        add(instructionsLabel);

        guessField = new JTextField(100);
        add(guessField);

        submitButton = new JButton("Submit Guess");
        submitButton.addActionListener(this);
        add(submitButton);

        resultLabel = new JLabel();
        add(resultLabel);

        randomNumber = (int) (Math.random() * 100) + 1; // Generate random number between 1 and 100

        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int guess = Integer.parseInt(guessField.getText());
            if (guess == randomNumber) {
                resultLabel.setText("Congratulations! You guessed it!");
            } else if (guess < randomNumber) {
                resultLabel.setText("Too low! Try again.");
            } else {
                resultLabel.setText("Too high! Try again.");
            }
        } catch (NumberFormatException ex) {
            resultLabel.setText("Please enter a valid number.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Temp();
            }
        });
    }
}
