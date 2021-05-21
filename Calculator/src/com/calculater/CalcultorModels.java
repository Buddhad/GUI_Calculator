package com.calculater;



public class CalcultorModels {

	private double num1;
	private double num2;
	private double num3;
	private String Operator;
	private double Result;
	
	
	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}

	public double getNum3() {
		return num3;
	}

	public void setNum3(double num3) {
		this.num3 = num3;
	}

	public String getOperator() {
		return Operator;
	}

	public void setOperator(String operator) {
		Operator = operator;
	}

	public double getResult() {
		return Result;
	}

	public void setResult(double result) {
		Result = result;
	}

	public double add() {
		return num1+num2;
	}
	
	public double sub() {
		return num1-num2;
	}
	public double multi() {
		return num1*num2;
	}
	public double div() {
		return num1/num2;
	}
	
	public double Modulus() {
		return num1%num2;
	}
	
	
	public void mod() {
		Result=num1*(num3/100);
	}
	
}

