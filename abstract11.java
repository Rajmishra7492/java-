

abstract class parent2 {
    public parent2() {
        System.out.println("mai base33 ka conturctor hun");
    }

    public void sayHello() {
        System.out.println("hello");
    }

    abstract public void greet();

}

class child2 extends parent2 {
    @Override
    public void greet() {
        System.out.println("Good morning");
    }
}

abstract class child3 extends child2 {
    public void th(){
        System.out.println("i am good");

    }

}

public class abstract11 {
    public static void main(String[] args) {
        // System.out.println();
        
        child2 c = new child2();
    }
    // abstracct is like which we are in our mind
    // abstract class ka object nhi bn sakta kyu ki vo class hai hi nahi vo ek jariya hai actual classs bnane ka like vo help karti hai class bnane me 
    // 
}
