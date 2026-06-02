class Employee1 {
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

}

class Cellphone {
    public void ring() {
        System.out.println("ringing");
    }

    public void vibrate() {
        System.out.println("vibrating");
    }

    public void callFriend() {
        System.out.println("calling friend");
    }

}

class square {
    int side;

    public int area() {
        return side * side;

    }

    public int perimeter() {
        return 4 * side;
    }

}

public class oppractics {
    public static void main(String[] args) {
        /*
         * //problem1
         * Employee1 raj= new Employee1();
         * raj.salary = 23333;
         * raj.setName("java oops");
         * System.out.println(raj.getName());
         * System.out.println(raj.getSalary());
         * 
         * //problem 2;
         * 
         * Cellphone vivot3 = new Cellphone();
         * vivot3.callFriend();
         * vivot3.vibrate();
         * vivot3.ring();
         */
        // problem 5:
        // square sq = new square();
        // sq.side =4;
        // System.out.println(sq.area());
        // System.out.println(sq.perimeter());

    }

}
