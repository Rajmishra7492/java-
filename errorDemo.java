
import java.util.Scanner;

public class errorDemo{
    public static void main(String[] args){
//        Syntax error
//        int a =5;
//        int b = 6;
//        c=56; this type of error called as syntax error because here c is not  declared
//        Logical Error demo
//        write a program to print prime number between 1 to 10
        System.out.println(2);
        for (int i = 1; i<5; i++){
            System.out.println(2*i+1);
        }

//        Runtime error 
        int k;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        k = sc.nextInt();
        System.out.println("integer part of divided by k is "+ 1000/k);
        

        
    }
}