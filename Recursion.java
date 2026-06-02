import java.util.Scanner;
public class Recursion{
    // recrion is that the function is calling itself 

        // factorial 0 is 1 
            // factorial (5) = 5*4*3*2*1 = 120;
            // factorial (n) = n* factorial(n-1)
     static int factorial(int n){
        if (n==0 || n==1){
             return 1;

            } 
            else{
                return n * factorial(n-1);
            }

        }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("the factorial of number is: ");
        int n = sc.nextInt();

        // int n = 5;
        // int n = sc.nextInt();
        System.out.println("the value of factorial n is "+ factorial(n));
    }
}