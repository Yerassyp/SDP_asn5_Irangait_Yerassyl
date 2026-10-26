package calculator;

import calculator.strategy.AddStrategy;
import calculator.strategy.SubtractStrategy;
import calculator.strategy.MultiplyStrategy;
import calculator.strategy.DivideStrategy;

public class Main {

    public static void main(String[] args) {

        double firstNumber = 20;
        double secondNumber = 5;

        Calculator calculator = new Calculator(new AddStrategy());

        System.out.println("Addition: " +
                calculator.calculate(firstNumber, secondNumber));

        calculator.setStrategy(new SubtractStrategy());
        System.out.println("Subtraction: " +
                calculator.calculate(firstNumber, secondNumber));

        calculator.setStrategy(new MultiplyStrategy());
        System.out.println("Multiplication: " +
                calculator.calculate(firstNumber, secondNumber));

        calculator.setStrategy(new DivideStrategy());
        System.out.println("Division: " +
                calculator.calculate(firstNumber, secondNumber));

        try {
            calculator.calculate(firstNumber, 0);
        } catch (IllegalArgumentException e) {
            System.out.println("Division by zero: " + e.getMessage());
        }
    }
}