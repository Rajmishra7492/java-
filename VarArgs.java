    /* VarArgs

    */ 
public class VarArgs{
    // static int sum (int a , int b){
    //     return a+b;
    // }
    // static int sum (int a, int b, int c, int d){
    //     return a+b+c+d;
    // }
    static int sum (int x , int ...arr){
        int result=0;
        for (int a: arr){
            result +=a;
        }
        return result;
    }

    public static void main(String[] args){
        System.out.println("Welcome to varags ");
        System.out.println("the sum of nothing "+ sum ());
        System.out.println("the sum of 4 and 5 is." +sum(4, 5));
        
        System.out.println("the sum of 2 ,4, 3,and 5" + sum ( 2, 4 , 3 ,5));

    }

}