package CalculatorExceptions;

public class InvalidNoOfDays extends Exception {
	public InvalidNoOfDays() {
		System.out.println("Invalid number! Please enter non-negative values.");
	}
}
