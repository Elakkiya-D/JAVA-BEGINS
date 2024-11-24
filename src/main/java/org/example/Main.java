package org.example;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random=new Random();
        //Scanner scan = new Scanner(System.in);
//        System.out.println("any random number:");
//        int y=scan.nextInt();

        int x=random.nextInt();
        double y= random.nextDouble();
        float a=random.nextFloat();
        String z=random.toString();
        long b=random.nextLong();
        boolean c=random.nextBoolean();
        System.out.println(y);
        System.out.println(x);
        System.out.println(z);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);









    }
}