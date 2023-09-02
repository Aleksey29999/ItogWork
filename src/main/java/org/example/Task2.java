package org.example;

public class Task2 {
    public static void main(String[] args) {

        try {
            int d = 0;

            int[] intArray = new int[]{8, 2, 6, 8, 7, 9, 6, 45, 2, 1, 23, 4, 7, 8};
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } catch (Exception e) {
            System.out.println("exception: " + e);
        }
    }
}