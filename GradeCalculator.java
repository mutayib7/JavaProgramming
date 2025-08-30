import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GradeCalculator extends JFrame implements ActionListener {
    JTextField[] marksFields;
    JButton calcBtn;
    JLabel resultLabel;

    public GradeCalculator() {
        setTitle("Grade Calculator");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(8, 2, 10, 10));

        marksFields = new JTextField[5];

        for (int i = 0; i < 5; i++) {
            add(new JLabel("Marks for Subject " + (i + 1) + ":"));
            marksFields[i] = new JTextField();
            add(marksFields[i]);
        }

        calcBtn = new JButton("Calculate Grade");
        calcBtn.addActionListener(this);
        add(calcBtn);

        resultLabel = new JLabel("Grade: ");
        add(resultLabel);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double total = 0;
            for (int i = 0; i < 5; i++) {
                double marks = Double.parseDouble(marksFields[i].getText());
                if (marks < 0 || marks > 100) {
                    JOptionPane.showMessageDialog(this, "Marks must be between 0 and 100.");
                    return;
                }
                total += marks;
            }

            double average = total / 5;
            String grade;

            if (average >= 90) grade = "A";
            else if (average >= 75) grade = "B";
            else if (average >= 60) grade = "C";
            else if (average >= 40) grade = "D";
            else grade = "F";

            resultLabel.setText("Grade: " + grade + " (Avg: " + average + ")");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers for all subjects.");
        }
    }

    public static void main(String[] args) {
        new GradeCalculator();
    }
}

