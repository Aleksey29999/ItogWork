package org.example;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        while (true) {
            try {
                System.out.print("введите дробное число= ");
                Scanner in = new Scanner(System.in);
                Float Number = in.nextFloat();
                System.out.println("дробное число =" + Number);
            } catch (NumberFormatException e) {
                System.out.println("Catching exception: " + e);
            } catch (Exception e) {
                System.out.println("exception: " + e);
            }
        }

    }
}