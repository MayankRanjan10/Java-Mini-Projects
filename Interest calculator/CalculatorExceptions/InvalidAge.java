package CalculatorExceptions;

public class InvalidAge extends Exception {
	public InvalidAge() {
		System.out.println("Invalid age! Please enter non-negative values.");
	}
}
