interface camera {
    void takeSnap();

    void recordVideo();
    
    default void record4kvideo(){
        System.out.println("recording in 4k...");
    }
}

interface Wifi {
    public String[] getNetwok();

    void connectToNetwork(String network);
}

class Cellphone {
    public void callnumber(int phoneNumber) {
        System.out.println("calling " + phoneNumber);
    }

    public void pickcall() {
        System.out.println("coonnecting ");
    }

}

class mysmartphone extends Cellphone implements Wifi, camera {
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

public class exampleofinterfaces {
    public static void main(String[] args) {
        mysmartphone ms = new mysmartphone();
        ms.record4kvideo();
        String[] ar = ms.getNetwok();
        for (String item : ar) {
            System.out.println(item);
            
        }
    }
}
