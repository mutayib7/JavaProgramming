import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DiscountCalculator extends JFrame implements ActionListener {
    JTextField priceField, discountField;
    JLabel resultLabel;
    JButton calcBtn;

    public DiscountCalculator() {
        setTitle("Discount Calculator");
        setSize(350, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2, 10, 10));

        add(new JLabel("Original Price:"));
        priceField = new JTextField();
        add(priceField);

        add(new JLabel("Discount (%):"));
        discountField = new JTextField();
        add(discountField);

        calcBtn = new JButton("Calculate");
        calcBtn.addActionListener(this);
        add(calcBtn);

        resultLabel = new JLabel("Final Price: ");
        add(resultLabel);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double price = Double.parseDouble(priceField.getText());
            double discount = Double.parseDouble(discountField.getText());

            double finalPrice = price - (price * discount / 100);
            resultLabel.setText("Final Price: " + finalPrice);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers.");
        }
    }

    public static void main(String[] args) {
        new DiscountCalculator();
    }
}

