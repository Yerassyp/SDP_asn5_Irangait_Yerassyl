package calculator;

import calculator.strategy.MathStrategy;

public class Calculator {

    private MathStrategy strategy;

    public Calculator(MathStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(MathStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculate(double firstNumber, double secondNumber) {
        return strategy.calculate(firstNumber, secondNumber);
    }
}