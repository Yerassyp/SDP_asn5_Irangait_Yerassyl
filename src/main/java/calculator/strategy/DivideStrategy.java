package calculator.strategy;

public class DivideStrategy implements MathStrategy {

    @Override
    public double calculate(double firstNumber, double secondNumber) {
        if (secondNumber == 0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }

        return firstNumber / secondNumber;
    }
}