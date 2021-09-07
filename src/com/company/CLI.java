package com.company;

import java.util.Scanner;

public class CLI {
    private static final Scanner userInput = new Scanner(System.in);

    public static int getNumberInput(String message){
        System.out.println(message);
//        int number = userInput.nextInt();
//        return number;
        return userInput.nextInt();

    }
}
