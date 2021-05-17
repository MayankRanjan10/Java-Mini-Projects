package CalculatorExceptions;

public class InvalidAmount extends Exception {
	public InvalidAmount() {
		System.out.println("Invalid amount! Please enter non-negative values.");
	}
}
