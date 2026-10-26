package calculator.strategy;

public class SubtractStrategy implements MathStrategy {

    @Override
    public double calculate(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }
}