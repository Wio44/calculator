package sk.wio.calculator;

import sk.wio.operations.*;

import java.util.*;

public class BasicCalculator extends AbstractCalculator {
    public BasicCalculator(String name, Map<Character, Operation> operationMap) {
        super(name, operationMap);
    }
}
