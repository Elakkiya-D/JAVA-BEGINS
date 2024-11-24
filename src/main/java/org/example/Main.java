package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//convert lower to upper
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a lower case letter");
        char lower=scan.next().charAt(0);
        // char lower='b';
        char upper =(char)(lower-32);
        System.out.println("upper:"+upper);


    }
}