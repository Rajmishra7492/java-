import java.util.Scanner;
public class practics2{
    public static void main(String[] args){
        // O1.
        // int a = 10;
        // if (a=11){

        // }
//Q2
        //assume 3 subject

        byte m1, m2, m3;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter your marks sub1 ");
        m1 = sc.nextByte();

        System.out.println("enter your marks sub2 ");
        m2 = sc.nextByte();

        System.out.println("enter your marks sub3 ");
        m3 =sc.nextByte();

        float avg = (m1 + m2 + m3)/3.0f;
        System.out.println("overall percentage is : " + avg);
        if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("congratulation, you have been promoted");
        
        }

        else{
            System.out.println("you have not been promoted");
        }
    }
}