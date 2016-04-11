package com.simple.calculator.main;

import java.util.Scanner;

import com.simple.calculator.SimpleCalculator;
import com.simple.calculator.operations.Operation;
import com.simple.calculator.operations.factory.OperationFactory;
import com.simple.calculator.parser.CalculusParser;

public class CalculatorTest {
	public static void main(String[] args){
		String calculus;

		do{
			Scanner scanner = new Scanner(System.in);
			calculus = scanner.nextLine();
			
			if(!"exit".equals(calculus)){
				CalculusParser parser = new CalculusParser(calculus);
				Operation operation = OperationFactory.getOperation(calculus);
				System.out.println(SimpleCalculator.calculate(parser.getA(), parser.getB(), operation));
			}else{
				scanner.close();
			}
		}while(!"exit".equals(calculus));
		
		
	}
}