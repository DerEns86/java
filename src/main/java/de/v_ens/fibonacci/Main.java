package de.v_ens.fibonacci;

public class Main {
    public static void main(String[] args) {
        System.out.println(calculateFibonacci(10));
    }

    public static int calculateFibonacci(int n) {

        if (n <= 1) {
            return n;
        } else {
            int fib1 = 1;
            int fib2 = 0;
            int sum = 0;

            for(int i = 2; i <= n; i++) {

                sum = fib1 + fib2;
                fib2 = fib1;
                fib1 = sum;
            }
            return sum;
        }

    }
}