import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.Year;

public class AgeCalculator extends JFrame implements ActionListener {
    private JTextField birthYearField;
    private JLabel resultLabel;
    private JButton calculateButton;

    public AgeCalculator() {
        setTitle("Age Calculator");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2, 10, 10));
        setLocationRelativeTo(null);

        // Components
        JLabel birthYearLabel = new JLabel("Enter Birth Year:");
        birthYearField = new JTextField();
        calculateButton = new JButton("Calculate Age");
        resultLabel = new JLabel("Your Age: ");

        calculateButton.addActionListener(this);

        // Add components
        add(birthYearLabel);
        add(birthYearField);
        add(new JLabel(""));
        add(calculateButton);
        add(new JLabel(""));
        add(resultLabel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int birthYear = Integer.parseInt(birthYearField.getText());
            int currentYear = Year.now().getValue();

            if (birthYear > currentYear || birthYear < 1900) {
                JOptionPane.showMessageDialog(this, "Invalid Birth Year!", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                int age = currentYear - birthYear;
                resultLabel.setText("Your Age: " + age + " years");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter a valid year!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(AgeCalculator::new);
    }
}
