package calculator.strategy;

public class MultiplyStrategy implements MathStrategy {

    @Override
    public double calculate(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }
}