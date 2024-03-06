package sk.wio.calculator;

import sk.wio.*;
import sk.wio.operations.*;

import java.util.*;

public abstract class AbstractCalculator {
    private final String name;
    private final Map<ArithmeticOperator, Operation> operationMap;

    public AbstractCalculator(String name, Map<ArithmeticOperator, Operation> operationMap) {
        this.name = name;
        this.operationMap = operationMap;
    }

    public double calculate(Operands operands, ArithmeticOperator operator) {
        if (this.operationMap.containsKey(operator)) {
            final Operation operation = this.operationMap.get(operator);
            final double result = this.calculateResult(operands, operation);
            printResult(result);
            return result;
        } else {
            throw new IllegalArgumentException("Calculator doesn't support operation: " + operator);
        }
    }

    private double calculateResult(Operands operands, Operation operation) {
        final double result = operation.calculate(operands.getLeft(), operands.getRight());
        return result;
    }

    private void printResult(double result) {
        System.out.println(this.name + " calculated result " + result);
    }
}


