class NegativeRaduisException extends Exception{
    public String toString(){

        return "Radius cannot be negative";
    }
    public String getMessage(){
        return " Radius cannot be negative()";
    }
}
public class ThrowsAndThrow {
    public static double area(int r)throws NegativeRaduisException{
        if (r>0){
            throw new NegativeRaduisException();
        }

        double result = Math.PI * r*r;
        return result;
    }
    public static int divide (int a, int b) throws ArithmeticException{
        int result = a/b;
        return result;
    }
    static void main(String[] args) {
        try{
            int c = divide(6,0);
            System.out.println(c);
        }catch (Exception e){
            System.out.println("Exception");
        }

    }
}
