import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;

public class CurrencyConverter extends JFrame implements ActionListener {
    private JTextField amountField;
    private JComboBox<String> fromCurrency, toCurrency;
    private JLabel resultLabel;
    private JButton convertButton;

    // Exchange rates (base: USD)
    private HashMap<String, Double> rates;

    public CurrencyConverter() {
        setTitle("Currency Converter");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2, 10, 10));
        setLocationRelativeTo(null);

        // Initialize rates
        rates = new HashMap<>();
        rates.put("USD", 1.0);
        rates.put("EUR", 0.92);
        rates.put("INR", 83.10);

        // Components
        JLabel amountLabel = new JLabel("Enter Amount:");
        amountField = new JTextField();

        JLabel fromLabel = new JLabel("From Currency:");
        fromCurrency = new JComboBox<>(new String[]{"USD", "EUR", "INR"});

        JLabel toLabel = new JLabel("To Currency:");
        toCurrency = new JComboBox<>(new String[]{"USD", "EUR", "INR"});

        convertButton = new JButton("Convert");
        resultLabel = new JLabel("Result: ");

        convertButton.addActionListener(this);

        // Add components to frame
        add(amountLabel);
        add(amountField);
        add(fromLabel);
        add(fromCurrency);
        add(toLabel);
        add(toCurrency);
        add(new JLabel(""));
        add(convertButton);
        add(new JLabel(""));
        add(resultLabel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double amount = Double.parseDouble(amountField.getText());
            String from = (String) fromCurrency.getSelectedItem();
            String to = (String) toCurrency.getSelectedItem();

            double convertedAmount = convertCurrency(amount, from, to);
            resultLabel.setText("Result: " + String.format("%.2f", convertedAmount) + " " + to);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter a valid number!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private double convertCurrency(double amount, String from, String to) {
        double amountInUSD = amount / rates.get(from);
        return amountInUSD * rates.get(to);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CurrencyConverter::new);
    }
}

