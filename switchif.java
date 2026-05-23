import java.util.Scanner;
public class switchif{
    public static void main(String[] args){
        int age;
        System.out.println("Enter your age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if(age>56){
            System.out.println("YOU ARE EXPERIENCED ! ");.
        }
        else if(age>46){
            System.out.println("you are semi semi experienced ! ");
        }
        else{
            System.out.println("you are not experinced");
        }
        if (age>2){
            System.out.println("you are not child");
        }
    }
}