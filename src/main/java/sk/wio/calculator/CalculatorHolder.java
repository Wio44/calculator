package sk.wio.calculator;

import sk.wio.operations.*;

import java.util.*;

public class CalculatorHolder {
    private BasicCalculator basicCalculator;
    private AdvancedCalculator advancedCalculator;

    public CalculatorHolder() {
        this.initializeCalculators();
    }

    private void initializeCalculators() {
        final Map<Character, Operation> basicCalculatorOperationMap = new HashMap<>();
        basicCalculatorOperationMap.put('+', new Addition());
        basicCalculatorOperationMap.put('-', new Subtraction());

        this.basicCalculator = new BasicCalculator("BasicCalculator", basicCalculatorOperationMap);

        final Map<Character, Operation> advancedCalculatorOperationMap = new HashMap<>();
        advancedCalculatorOperationMap.put('*', new Multiplication());
        advancedCalculatorOperationMap.put('/', new Division());

        this.advancedCalculator = new AdvancedCalculator("AdvancedCalculator", advancedCalculatorOperationMap);
    }

    public AbstractCalculator getSuitableCalculator(char operator) {
        switch (operator) {
            case '+', '-' -> {
                return this.basicCalculator;
            }
            case '*', '/' -> {
                return this.advancedCalculator;
            }
            default -> throw new IllegalArgumentException("Unsupported operation");
        }
    }
}
