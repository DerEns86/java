package de.v_ens.statics;

public class Calculator {

    public static double add( double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    public static double subtract( double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    public static double multiply( double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    public static double divide( double firstNumber, double secondNumber) {
        if (secondNumber > 0) {
            return firstNumber / secondNumber;
        } else {
            return 0;
        }
    }

}
