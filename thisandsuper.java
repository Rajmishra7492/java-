class Ekclass {
    int a;

    public int getA() {
        return a;
    }

    Ekclass(int a) {
        this.a = a;
    }

    public int returnone() {
        return 1;
    }
}

class doclass extends Ekclass {
    doclass(int c) {
        super(c);
        System.out.println("mai ek contructor hun");
    }
    // public doclass() {
    // super(0);
    // }

}

public class thisandsuper {
    public static void main(String[] args) {
        Ekclass e = new Ekclass(5);
        doclass d = new doclass(68);
        System.out.println(e.getA());
    }

}
// this: is a refrence of class of object
// super keyword: a refrence variable used to refer immidiate parent class
// object.
//super takes integer value
