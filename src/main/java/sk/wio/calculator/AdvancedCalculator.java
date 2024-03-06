package sk.wio.calculator;

import sk.wio.*;
import sk.wio.operations.*;

import java.util.*;

public class AdvancedCalculator extends AbstractCalculator {
    public AdvancedCalculator(String name, Map<ArithmeticOperator, Operation> operationMap) {
        super(name, operationMap);
    }
}
