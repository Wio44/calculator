package sk.wio.operations;

public class Multiplication implements Operation {
    @Override
    public double calculate(double left, double right) {
        return left * right;
    }
}
