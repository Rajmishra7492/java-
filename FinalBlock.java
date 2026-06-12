package com.company;

public class FinalBlock {
    public static int greet(){
        try{
            int a = 50;
            int b=10;
            int c = a/b;
            return c;
        }catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println("cleaning up resource.... this is the end of program");
        }
        return 0;
    }
    public static void main(String[] args) {
       int k = greet();
        System.out.println(k);
        int a = 7;
        int b = 9;

        while(true){
            try{

                System.out.println(a/b);

            }catch(Exception e){
                System.out.println(e);
                break;
            }
            finally{
                System.out.println("i am a finally for value of b = " + b);
            }
            b--;
        }
        try{
            System.out.println(59/3);
        }
        finally {
            System.out.println("yess we can use finally at the place of catch");
        }

    }
}
