package calculator;

public class Calculator {
	private int result; //필드
	
	
	public int getResult() { 
		return result;
	}


	public Calculator(int num1, int num2, String operator) {
		switch (operator) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 + num2;
			break;
		case "*":
			result = num1 + num2;
			break;
		case "/":
			result = num1 + num2;
			break;
		}
		
	}
}
