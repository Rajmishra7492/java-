import java.util.Scanner;

public class FinalPractics {
    public static void main(String[] args) {
        // Problem 1
        //Syntax error - int a =7;
//      Logical error
//        int age = 78;
//        int year_born =2000-78;
//        System.out.println(6/0);
        //problem 2 ! print haha and hihi
//        try{
//            int a =777/0;
//        }catch (IllegalArgumentException e){
//            System.out.println("hihi");
//
//        }catch (ArithmeticException e){
//            System.out.println("haha");

// }
        boolean flag = true;
        int [] marks = new int [3];
        marks[0] = 7;
        marks[1]= 56;
        marks[2] = 6;
        Scanner Sc = new Scanner (System.in);

        int index;
        int i = 0;
        while(flag&& i<5){
            try{
                System.out.println("Enter the value of index");
                index = Sc.nextInt();
                System.out.println("the value of marks[index] is " + marks[index]);
            }
            catch(Exception e){
//                System.out.println(e);
                System.out.println("Invalid Index");
                i++;
            }
        }
        if (i>=5){
            System.out.println("Error");
        }

    }
}


