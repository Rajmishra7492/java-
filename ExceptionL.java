import java.util.Scanner;

class MyException extends Exception {
    public String toString() {
        return "i am toString";
    }

    public String getMessage() {
        return " i am getMessage()";
    }
}

public class ExceptionL {
   public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if(a<9){
            try{
//                throw new MyException();
                throw new ArithmeticException("this is an exception");
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
                System.out.println("Finished");
            }
            System.out.println("yes finished");
        }

    }
}
