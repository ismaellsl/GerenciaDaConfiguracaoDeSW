package com.simple.calculator;

import com.simple.calculator.operations.Operation;

public class SimpleCalculator {
	public static int calculate(int a, int b, Operation operation) {
		return operation.doOperation(a, b);
	}
}
