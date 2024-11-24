package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("enter your age:");
        int age = scan.nextInt();
        if (age >18){
            System.out.println("your an adult");
        }
        else if (age==18) {
            System.out.println("your 18");

        }
        else{
            System.out.println("your not an adult");
        }
        int income =1200000;
        boolean hashighincome=(income>10000);
        System.out.println(hashighincome);




    }
}