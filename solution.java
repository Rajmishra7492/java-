import java.util.Scanner;
// percentage of 5 subject marks 

public class solution {
    public static void main(String[] args ){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your physics : ");
        int physics = scan.nextInt();
        System.out.println("Enter your English : ");
        int English = scan.nextInt();
        System.out.println("Enter your Chemistry : ");
        int Chemistry = scan.nextInt();
        System.out.println("Enter your Math : ");
        int Math = scan.nextInt();
        System.out.println("Enter your COMPUTER  : ");
        int COMPUTER = scan.nextInt();

        float percentage = ((physics + Chemistry + English + Math + COMPUTER)/ 500.0F)*100;

        System.out.println("percentage : ");
        System.out.println(percentage);


    } 
}