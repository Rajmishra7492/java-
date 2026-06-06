
// package com.company;
import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int a = scan.nextInt();
        if (a > 18) {
            System.out.println("yess boy you can drive!");
        } else {
            System.out.println("No boy you cannnot drive yet!");

        }
    }
}