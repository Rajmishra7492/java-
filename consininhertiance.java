class base1 {

    base1() {
        System.out.println("im a constuctor");
    }

    base1(int x) {
        System.out.println("im a overloaded consturctor with value of a zero" + x);
    }

    int x;

    public int getx() {
        return x;
    }

    public void setx(int x) {
        this.x = x;
    }

}

class Derived1 extends base1 {
    Derived1() {
        // super(0);
        System.out.println("im derived class constructor ");
    }

    Derived1(int x, int y) {
        super(x);
        System.out.println("im a overloaded contructor of a derived with value of as :" + y);
    }

    public int y;

    public int gety() {
        return y;
    }

    public void sety(int y) {
        this.y = y;

    }

}

class childofDerived1 extends Derived1 {
    public childofDerived1() {
        System.out.println("im a an overloaded condtruction of childofderived with value of z as:");
    }

    public childofDerived1(int x, int y, int z) {
        super(x, y);
        System.out.println("im a an overloaded condtruction of derived with value of z as:" + z);
    }
}

public class consininhertiance {

    public static void main(String[] args) {
        // base1 b = new base1();
        // Derived1 d = new Derived1();
        // Derived1 d = new Derived1(14,9 );
        childofDerived1 cd = new childofDerived1();

    }
}
