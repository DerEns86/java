package de.v_ens.statics;

public class Main {

    public static void main(String[] args) {

        Counter counter1 = new Counter();
        System.out.println(counter1);
        counter1.incrementInstanceCount();
        System.out.println(counter1);
        counter1.incrementInstanceCount();
        System.out.println(counter1);

        Counter.totalCount = 1;
        System.out.println(Counter.totalCount);
        Counter.totalCount++;
        System.out.println(Counter.totalCount);

        System.out.println();
        System.out.println("##### Bonus #####");
        System.out.println("Add: " + Calculator.add(12, 14));
        System.out.println("Subtract: " + Calculator.subtract(12, 14));
        System.out.println("Multiply: " + Calculator.multiply(12, 14));
        System.out.println("Divide: " + Calculator.divide(12, 14));
        System.out.println("Divide by zero: " + Calculator.divide(12, 0));



    }
}
