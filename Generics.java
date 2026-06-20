
import java.util.ArrayList;
import java.util.Scanner;
class myGeneric<T1>{
    int val = 344;
    private T1 t1;

    public myGeneric(int val, T1 t1) {
        this.val = val;
        this.t1 = t1;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    public int getVal() {
        return val;
    }

    public T1 getT1() {
        return t1;
    }
}
public class Generics {
    static void main(String[] args) {
        ArrayList <Integer> arrayList = new ArrayList<>();// this is generic in which we say that the code the writen variable is integer.
//        ArrayList <int> arrayList = new ArrayList<>(); this will produce an error because int is primitive datatype
//        arrayList.add("str1");
        arrayList.add(54);
        arrayList.add(675);
//        arrayList.add(new Scanner(System.in ));
        int a = (int) arrayList.get(1);
//        System.out.println(a);\
        myGeneric <String> g1 = new myGeneric(23, "myString");
       String str =  g1.getT1();

        System.out.println(str);



    }
}
