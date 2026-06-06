public class method_overloading {
    static void foo() {
        System.out.println("good morning bro...");
    }

    static void foo(int a) {
        System.out.println("good morning " + a + "bro!");
    }

    static void foo(int a, int b) {
        System.out.println("good morning " + a + "bro!");
        System.out.println("good morning " + b + "bro!");
    }

    static void change(int a) {
        a = 98;

    }

    static void change2(int[] arr) {
        arr[0] = 98;
    }

    static void telljoke() {
        System.out.println("i invented a new word:\n" + "palagrism");

    }

    public static void main(String[] args) {
        telljoke();
        // case 1 : Changing the integer
        // int [] marks = { 52, 32, 33,67,56,94};
        // int x = 24;
        // change(x);
        // System.out.println("the value of x after running change\n"+ x);
        // THERE IS NO CHANGE
        // case 2 : Changing the array
        // int [] marks = { 52, 32, 33,67,56,94};
        // change2(marks);
        // System.out.println("the value of x after running change\n"+ marks[0]);
        // THERE IS CHANGE BECAUSE THE ARRAY OBJECT IS FORM THEN THE ADRESS IS CHANGED
        // IN THIS THE REFRENSE WAS COPIED....... IN CASE OF ARRAY THE REFRENCE IS
        // PASSED. SAME IN THE CASE FOR OBJECTT PASSING TO METHODS.
        /*
         * METHOD OVERLOADING
         */
        foo();
        foo(3000);
        foo(4000, 4000);
        // argument are actual values
        // the given value is parameter

    }
}