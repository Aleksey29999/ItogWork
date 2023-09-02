package org.example;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        while (true) {
            System.out.print("введите строку: ");
            Scanner in = new Scanner(System.in);
            String Str = in.nextLine();
            if ((Str.length() == 0)) {
                throw new RuntimeException("Пустые строки вводить нельзя");
            }
            System.out.println("Строка: " + Str);


        }
    }
}

