//without using applet
import java.util.Scanner;

public class ArithmeticDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        float quotient = (float) num1 / num2;
        int remainder = num1 % num2;

        System.out.println("The sum of the two numbers is: " + sum);
        System.out.println("The difference of the two numbers is: " + difference);
        System.out.println("The product of the two numbers is: " + product);
        System.out.println("The quotient of the two numbers is: " + quotient);
        System.out.println("The remainder of the two numbers is: " + remainder);
    }
}

//with using applet
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleCalculator extends JFrame implements ActionListener {
    JTextField textField;
    double num1, num2, result;
    int operator;

    public SimpleCalculator() {
        setLayout(new BorderLayout());

        textField = new JTextField();
        add(textField, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));

        String[] buttonLabels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "C", "=", "+"
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(this);
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Simple Calculator");
        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        if (action.matches("[0-9]")) {
            textField.setText(textField.getText() + action);
        } else if (action.matches("[+\\-*/]")) {
            num1 = Double.parseDouble(textField.getText());
            operator = action.equals("+") ? 1 : action.equals("-") ? 2 : action.equals("*") ? 3 : 4;
            textField.setText("");
        } else if (action.equals("=")) {
            num2 = Double.parseDouble(textField.getText());
            switch (operator) {
                case 1: result = num1 + num2; break;
                case 2: result = num1 - num2; break;
                case 3: result = num1 * num2; break;
                case 4: result = num1 / num2; break;
            }
            textField.setText(String.valueOf(result));
        } else if (action.equals("C")) {
            textField.setText("");
        }
    }

    public static void main(String[] args) {
        new SimpleCalculator();
    }
}
