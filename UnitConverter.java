import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UnitConverter extends JFrame implements ActionListener {
    JTextField inputField;
    JComboBox<String> fromUnit, toUnit;
    JLabel resultLabel;
    JButton convertBtn;

    public UnitConverter() {
        setTitle("Unit Converter");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2, 10, 10));

        add(new JLabel("Value:"));
        inputField = new JTextField();
        add(inputField);

        add(new JLabel("From Unit:"));
        String[] units = {"Meters", "Kilometers", "Grams", "Kilograms"};
        fromUnit = new JComboBox<>(units);
        add(fromUnit);

        add(new JLabel("To Unit:"));
        toUnit = new JComboBox<>(units);
        add(toUnit);

        convertBtn = new JButton("Convert");
        convertBtn.addActionListener(this);
        add(convertBtn);

        resultLabel = new JLabel("Converted Value: ");
        add(resultLabel);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double value = Double.parseDouble(inputField.getText());
            String from = (String) fromUnit.getSelectedItem();
            String to = (String) toUnit.getSelectedItem();
            double result = 0;

            if (from.equals("Meters") && to.equals("Kilometers")) {
                result = value / 1000;
            } else if (from.equals("Kilometers") && to.equals("Meters")) {
                result = value * 1000;
            } else if (from.equals("Grams") && to.equals("Kilograms")) {
                result = value / 1000;
            } else if (from.equals("Kilograms") && to.equals("Grams")) {
                result = value * 1000;
            } else {
                result = value; // Same unit conversion
            }

            resultLabel.setText("Converted Value: " + result);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Enter a valid number.");
        }
    }

    public static void main(String[] args) {
        new UnitConverter();
    }
}

