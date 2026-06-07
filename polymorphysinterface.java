interface camera2 {
    void takeSnap();

    void recordVideo();

    default void record4kvideo() {
        System.out.println("recording in 4k...");
    }
}

interface Wifi2 {
    public String[] getNetwok();

    void connectToNetwork(String network);
}

class Cellphone2 {
    public void callnumber(int phoneNumber) {
        System.out.println("calling " + phoneNumber);
    }

    public void pickcall() {
        System.out.println("coonnecting ");
    }

}

class mysmartphone2 extends Cellphone2 implements Wifi2, camera2 {
    public void takeSnap() {
        System.out.println("taking snap");
    }

    public void recordVideo() {
        System.out.println("taking snap");
    }

    public void record4kvideo() {
        System.out.println("taking snap and recording in 4k....");
    }

    public String[] getNetwok() {
        System.out.println("getting list of netwok");
        String[] networkList = { "jio", "airtel", "vi" };
        return networkList;
    }

    public void connectToNetwork(String network) {

        System.out.println("connecting to " + network);
    }

}

public class polymorphysinterface {
    public static void main(String[] args) {
        camera2 cam1 = new mysmartphone2();
        // cam1.getNetwok(); //not allowed because we want to use camera that's why we
        // cannot use network
        cam1.record4kvideo();
        mysmartphone2 s = new mysmartphone2();
    }
}
