package org.example;

public class Calculator {
    private int firstNumber;
    private int secondNumber;
    private long result;

    public Calculator() {
    }

    public long addTwoNumbers(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        return result = this.firstNumber + this.secondNumber;
    }
}
