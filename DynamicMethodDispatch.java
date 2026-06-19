class phone {
    public void showTime() {
        System.out.println("The time is 8 pm");
    }

    public void on() {
        System.out.println("turning on Phone");
    }

}

class SmartPhone extends phone {

    public void music() {
        System.out.println("playing music");

    }

    public void on() {
        System.out.println("Turning on Smartphone");
    }
}
public class DynamicMethodDispatch {
    public static void main(String[] args) {
        // phone obj = new phone();
        // SmartPhone smobj= new SmartPhone();
        // obj.name();
        phone obj = new SmartPhone();
        // obj.showTime();
        obj.showTime();
        obj.on();


    }
}
