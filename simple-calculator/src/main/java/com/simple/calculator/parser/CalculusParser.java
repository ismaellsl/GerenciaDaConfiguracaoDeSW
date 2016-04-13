package com.simple.calculator.parser;

public class CalculusParser {
	private int[] operands;

	public CalculusParser(String calculus){
		String[] array = calculus.split("\\+|-|\\*|\\/");
		operands = new int[]{Integer.parseInt(array[0].trim()), Integer.parseInt(array[1].trim())};
	}
	
	public int getA(){
		int a = operands[0];
		return a;
	}
	
	public int getB(){
		int b = operands[1];
		return b;
	}
}
