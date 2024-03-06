package sk.wio;

import sk.wio.calculator.*;

import java.util.*;

public class Main {
    private final static Scanner scanner = new Scanner(System.in);
    private final static CalculatorHolder calculatorHolder = new CalculatorHolder();

    public static void main(String[] args) {
        do {
            System.out.println("Write number, then type of operation (+, -, *, /) and then wriate number again");

            final double left, right;
            final char operator;
            try {
                left = scanner.nextDouble();
                operator = scanner.next().charAt(0);
                right = scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input");
                scanner.nextLine();
                continue;
            }

            final Operands operands = new Operands(left, right);
            final AbstractCalculator calculator = calculatorHolder.getSuitableCalculator(operator);
            calculator.calculate(operands, operator);

            System.out.println("Left " + operands.getLeft() + ", operation: " + operator + ", right: " + operands.getRight());

        } while (true);
    }
}
