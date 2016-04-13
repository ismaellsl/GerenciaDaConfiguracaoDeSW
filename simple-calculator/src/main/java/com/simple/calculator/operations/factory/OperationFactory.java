package com.simple.calculator.operations.factory;

import com.simple.calculator.operations.*;
import com.simple.calculator.operations.exception.OperationNotFoundException;

public class OperationFactory {
	public static Operation getOperation(String calculus) {
		if(calculus.contains("+"))
			return new AdditionOperation();
		else if(calculus.contains("-"))
			return new SubtractionOperation();
		else if(calculus.contains("/"))
			return new DivisionOperation();
		else if(calculus.contains("*"))
			return new MultiplicationOperation();
		else throw new OperationNotFoundException();
	}
}
