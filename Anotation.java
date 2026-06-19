@FunctionalInterface
 interface myFuntionalInterface{
    void thisMethod();
//    void thismethod2();

}
class newPhone extends phone{
    @Override
    public void showTime(){
        System.out.println("time is 9 PM");

    }
    public int sum(int a , int b){
        return a+b;
    }
}

public class Anotation { // Annotation give about information of meta data
    @SuppressWarnings("deprecated")
    public static void main(String[] args) {
        newPhone phone = new newPhone();
        phone.showTime();
        phone.sum(5,6);
        // Funtional Interface contans only one a single abstract method
    }
}