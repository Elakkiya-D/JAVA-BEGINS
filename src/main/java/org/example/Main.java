package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("enter your age:");
        int age = scan.nextInt();
        if (age<18){
            System.out.println("your not eligible to vote");
        }
        else{
            System.out.println("your eligible to vote");
        }




    }
}