package com.company;

import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int max = 0;

        //infinite loop
        while(true){
            //take input
            int num = in.nextInt();

            //check number is 0 or not, if yes, then break the loop
            if(num == 0){
                break;
            }

            //check current number greater or not
            if(num > max){
                max = num;
            }
        }
        System.out.println(max);
    }
}
