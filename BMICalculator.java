import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BMICalculator extends JFrame {
    private JTextField weightField, heightField;
    private JLabel resultLabel;

    public BMICalculator() {
        setTitle("BMI Calculator");
        setSize(350, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        // Labels and TextFields
        add(new JLabel("Enter Weight (pounds):"));
        weightField = new JTextField(10);
        add(weightField);

        add(new JLabel("Enter Height (inches):"));
        heightField = new JTextField(10);
        add(heightField);

        // Empty placeholder for alignment
        add(new JLabel(""));

        // Button
        JButton calculateButton = new JButton("Calculate BMI");
        add(calculateButton);

        // Result label
        resultLabel = new JLabel("Your BMI and Category will appear here.");
        
        add(resultLabel);

        // Event handling
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateBMI();
            }
        });
    }

    private void calculateBMI() {
        try {
            double weight = Double.parseDouble(weightField.getText());
            double height = Double.parseDouble(heightField.getText());

            if (height <= 0 || weight <= 0) {
                JOptionPane.showMessageDialog(this, "Height and Weight must be positive!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            double bmi = 703*weight / (height * height);
            String category;

            if (bmi < 18.5) {
                category = "Underweight";
            } else if (bmi < 24.9) {
                category = "Normal";
            } else {
                category = "Overweight";
            }

            resultLabel.setText(String.format("BMI: %.2f (%s)", bmi, category));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new BMICalculator().setVisible(true);
        });
    }
}
