package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//logical  operator
        int a=54;
        int b=20;
        System.out.println(a<b && a>b);
        System.out.println(a>b || a<b);
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter Q or q to quit the game");
        String response = scanner.nextLine();
        if(response.equals("q") || response.equals("Q")) {
            System.out.println("you quit the game");
        }
        else {
            System.out.println("your Still playing");
        }



    }
}