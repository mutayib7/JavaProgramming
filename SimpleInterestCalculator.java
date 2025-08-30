import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleInterestCalculator extends JFrame implements ActionListener {
    private JTextField principalField, rateField, timeField;
    private JLabel resultLabel;
    private JButton calculateButton, resetButton;

    public SimpleInterestCalculator() {
        setTitle("Simple Interest Calculator");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2, 10, 10));
        setLocationRelativeTo(null);

        // Labels and Fields
        JLabel principalLabel = new JLabel("Principal Amount:");
        principalField = new JTextField();

        JLabel rateLabel = new JLabel("Rate of Interest (%):");
        rateField = new JTextField();

        JLabel timeLabel = new JLabel("Time (Years):");
        timeField = new JTextField();

        resultLabel = new JLabel("Simple Interest: ");

        // Buttons
        calculateButton = new JButton("Calculate");
        resetButton = new JButton("Reset");

        calculateButton.addActionListener(this);
        resetButton.addActionListener(this);

        // Add components
        add(principalLabel);
        add(principalField);
        add(rateLabel);
        add(rateField);
        add(timeLabel);
        add(timeField);
        add(calculateButton);
        add(resetButton);
        add(new JLabel(""));
        add(resultLabel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == calculateButton) {
            try {
                double principal = Double.parseDouble(principalField.getText());
                double rate = Double.parseDouble(rateField.getText());
                double time = Double.parseDouble(timeField.getText());

                double simpleInterest = (principal * rate * time) / 100;
                resultLabel.setText("Simple Interest: " + String.format("%.2f", simpleInterest));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Please enter valid numbers!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (e.getSource() == resetButton) {
            principalField.setText("");
            rateField.setText("");
            timeField.setText("");
            resultLabel.setText("Simple Interest: ");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SimpleInterestCalculator::new);
    }
}

