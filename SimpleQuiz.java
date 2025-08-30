import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleQuiz extends JFrame implements ActionListener {
    JRadioButton option1, option2, option3, option4;
    JButton submitBtn;
    ButtonGroup group;

    public SimpleQuiz() {
        setTitle("Simple Quiz");
        setSize(400, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JLabel question = new JLabel("Which is the largest planet in our solar system?");
        question.setHorizontalAlignment(JLabel.CENTER);
        add(question, BorderLayout.NORTH);

        JPanel optionsPanel = new JPanel();
        optionsPanel.setLayout(new GridLayout(4, 1));

        option1 = new JRadioButton("Earth");
        option2 = new JRadioButton("Mars");
        option3 = new JRadioButton("Jupiter");
        option4 = new JRadioButton("Venus");

        group = new ButtonGroup();
        group.add(option1);
        group.add(option2);
        group.add(option3);
        group.add(option4);

        optionsPanel.add(option1);
        optionsPanel.add(option2);
        optionsPanel.add(option3);
        optionsPanel.add(option4);

        add(optionsPanel, BorderLayout.CENTER);

        submitBtn = new JButton("Submit");
        submitBtn.addActionListener(this);
        add(submitBtn, BorderLayout.SOUTH);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (option3.isSelected()) {
            JOptionPane.showMessageDialog(this, "Correct! Jupiter is the largest planet.");
        } else {
            JOptionPane.showMessageDialog(this, "Wrong Answer! Correct answer is Jupiter.");
        }
    }

    public static void main(String[] args) {
        new SimpleQuiz();
    }
}

