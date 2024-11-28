import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class SwingDemo {
    SwingDemo() {
        // Create JFrame container
        JFrame jfrm = new JFrame("Divider App");
        jfrm.setSize(275, 200);
        jfrm.setLayout(new FlowLayout());

        // To terminate on close
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Text label
        JLabel jlab = new JLabel("Enter the divider and dividend:");

        // Add text field for both numbers
        JTextField ajtf = new JTextField(8);
        JTextField bjtf = new JTextField(8);

        // Calculate button
        JButton button = new JButton("Calculate");

        // Labels to display results and error messages
        JLabel err = new JLabel();
        JLabel alab = new JLabel();
        JLabel blab = new JLabel();
        JLabel anslab = new JLabel();

        // Add components to the frame
        jfrm.add(jlab);       // Label for the user input
        jfrm.add(ajtf);       // Text field for the first number (divider)
        jfrm.add(bjtf);       // Text field for the second number (dividend)
        jfrm.add(button);     // Calculate button
        jfrm.add(alab);       // Label to display the value of A (divider)
        jfrm.add(blab);       // Label to display the value of B (dividend)
        jfrm.add(anslab);     // Label to display the answer
        jfrm.add(err);        // Error message label

        // ActionListener for the Calculate button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    // Parsing input from text fields
                    int a = Integer.parseInt(ajtf.getText());
                    int b = Integer.parseInt(bjtf.getText());

                    // Performing the division
                    int ans = a / b;

                    // Updating the labels with the results
                    alab.setText("A = " + a);
                    blab.setText("B = " + b);
                    anslab.setText("Ans = " + ans);

                    // Clear any previous error message
                    err.setText("");

                } catch (NumberFormatException e) {
                    // Handling invalid input (non-integer values)
                    alab.setText("");
                    blab.setText("");
                    anslab.setText("");
                    err.setText("Enter Only Integers!");

                } catch (ArithmeticException e) {
                    // Handling division by zero error
                    alab.setText("");
                    blab.setText("");
                    anslab.setText("");
                    err.setText("B should be NON-zero!");
                }
            }
        });

        // Display the frame
        jfrm.setVisible(true);
    }

    public static void main(String args[]) {
        // Create the frame on the Event Dispatching Thread
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingDemo();
            }
        });
        System.out.println("Name : Kanishka Sharma");
        System.out.println("USN : 1BM23CS138");
    }
}
