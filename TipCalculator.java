import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TipCalculator extends JFrame implements ActionListener {
    JTextField billField;
    JComboBox<String> tipBox;
    JLabel resultLabel;
    JButton calcBtn;

    public TipCalculator() {
        setTitle("Tip Calculator");
        setSize(350, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2, 10, 10));

        add(new JLabel("Total Bill Amount:"));
        billField = new JTextField();
        add(billField);

        add(new JLabel("Tip Percentage:"));
        String[] tips = {"10%", "15%", "20%"};
        tipBox = new JComboBox<>(tips);
        add(tipBox);

        calcBtn = new JButton("Calculate Tip");
        calcBtn.addActionListener(this);
        add(calcBtn);

        resultLabel = new JLabel("Tip Amount: ");
        add(resultLabel);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double bill = Double.parseDouble(billField.getText());
            String tipSelected = (String) tipBox.getSelectedItem();
            int tipPercent = Integer.parseInt(tipSelected.replace("%", ""));
            double tipAmount = bill * tipPercent / 100;
            resultLabel.setText("Tip Amount: " + tipAmount);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter a valid bill amount.");
        }
    }

    public static void main(String[] args) {
        new TipCalculator();
    }
}

