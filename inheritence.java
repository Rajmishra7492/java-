class base {
     int x;

     public int getx() {
          return x;
     }

     public void setx(int x) {
          System.out.println("i am in base  setting x now ");
          this.x = x;
     }

     public void printMe() {
          System.out.println("i am a conturctor");
     }
}

class Derived extends base {
     public int y;

     public int gety() {
          return y;
     }

     public void setY(int y) {
          this.y = y;

     }

}

public class inheritence {
     public static void main(String[] args) {
          // creating a base class object
          base b = new base();
          b.setx(4);
          System.out.println(b.getx());

          // creating a derived class object
          Derived d = new Derived();
          d.setx(4);
          System.out.println(d.getx());

     }
}
