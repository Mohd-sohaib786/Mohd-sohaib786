package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Factorial of a number

        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        int i, fact=1;

        for(i =1; i<=num; i++){

            fact = fact * i;

        }

        System.out.println("The factorial of number " +num+ " is " +fact);
      
    }
}
