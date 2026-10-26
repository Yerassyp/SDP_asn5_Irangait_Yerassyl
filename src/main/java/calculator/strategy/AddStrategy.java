package calculator.strategy;

public class AddStrategy implements MathStrategy {

    @Override
    public double calculate(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }
}