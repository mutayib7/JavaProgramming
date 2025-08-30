import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VolumeCalculator extends JFrame implements ActionListener {
    private JTextField lengthField, widthField, heightField;
    private JLabel resultLabel;
    private JButton calculateButton, resetButton;

    public VolumeCalculator() {
        setTitle("Volume Calculator");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2, 10, 10));
        setLocationRelativeTo(null);

        // Labels and Fields
        JLabel lengthLabel = new JLabel("Length:");
        lengthField = new JTextField();

        JLabel widthLabel = new JLabel("Width:");
        widthField = new JTextField();

        JLabel heightLabel = new JLabel("Height:");
        heightField = new JTextField();

        resultLabel = new JLabel("Volume: ");

        // Buttons
        calculateButton = new JButton("Calculate");
        resetButton = new JButton("Reset");

        calculateButton.addActionListener(this);
        resetButton.addActionListener(this);

        // Add components
        add(lengthLabel);
        add(lengthField);
        add(widthLabel);
        add(widthField);
        add(heightLabel);
        add(heightField);
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
                double length = Double.parseDouble(lengthField.getText());
                double width = Double.parseDouble(widthField.getText());
                double height = Double.parseDouble(heightField.getText());

                if (length <= 0 || width <= 0 || height <= 0) {
                    JOptionPane.showMessageDialog(this, "Dimensions must be positive numbers!", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    double volume = length * width * height;
                    resultLabel.setText("Volume: " + String.format("%.2f", volume));
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Please enter valid numbers!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (e.getSource() == resetButton) {
            lengthField.setText("");
            widthField.setText("");
            heightField.setText("");
            resultLabel.setText("Volume: ");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(VolumeCalculator::new);
    }
}

