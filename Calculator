import java.util.Scanner;

interface Calculator {
    double add(double a, double b);
    double subtract(double a, double b);
    double multiply(double a, double b);
    double divide(double a, double b);
}

class SimpleCalculator implements Calculator {
    public double add(double a, double b) {
        return a + b;
    }
    public double subtract(double a, double b) {
        return a - b;
    }
    public double multiply(double a, double b) {
        return a * b;
    }
    public double divide(double a, double b) {
        if (b == 0) throw new ArithmeticException("Division by zero");
        return a / b;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new SimpleCalculator();
        try {
            System.out.print("Enter first no: ");
            double x = sc.nextDouble();
            System.out.print("Enter second no: ");
            double y = sc.nextDouble();

            System.out.println("Addition: " + calc.add(x, y));
            System.out.println("Subtraction: " + calc.subtract(x, y));
            System.out.println("Multiplication: " + calc.multiply(x, y));
            System.out.println("Division: " + calc.divide(x, y));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input: " + e);
        }
    }
}
