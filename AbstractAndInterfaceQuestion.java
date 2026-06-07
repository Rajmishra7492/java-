abstract class pen {
    abstract void refile();

    abstract void write();
}

class Fountainpen extends pen {
    void write() {
        System.out.println("write");

    }

    void refile() {
        System.out.println("refile");
    }

    void changeNib() {
        System.out.println("changing the nib");
    }
}

class monkey {
    void jump() {
        System.out.println("jumpinggg....");
    }

    void bite() {
        System.out.println("biting");
    }
}

interface basicanimal {
    void eat();

    void sleep();
}

class human extends monkey implements basicanimal {
    void speek() {
        System.out.println("hello sir");
    }

    @Override
    public void eat() {
        System.out.println("eating");
    }

    @Override
    public void sleep() {
        System.out.println("sleeping");

    }
}

public class AbstractAndInterfaceQuestion {
    public static void main(String[] args) {
        // Q1 and 2
        Fountainpen pen = new Fountainpen();
        pen.write();
        pen.changeNib();
        // Q3
        human raj = new human();
        raj.sleep();
        raj.eat();


        //Q4
        monkey m1 = new human();
        // m1.speek();  cannot use speek method because the refrense is monkey which does not have speek meathod
        basicanimal shubh = new human();
        shubh.eat();
        shubh.sleep();

    }
}
