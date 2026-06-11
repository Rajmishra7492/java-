
class myth2 extends Thread {

    @Override
    public void run() {
        int i= 0;
        while (true){
            System.out.println("thank you" );
            try {
                Thread.sleep(555);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            i++;
        }
    }
}
class myth3 extends Thread{

    @Override
    public void run() {
        while (true){
            System.out.println("thank you raj");

        }
    }
}


public class ThreadMethod {
    public static void main(String[] args) {
        myth2 t1 = new myth2();
        myth3 t2 = new myth3();
        t1.start();
        // try {
        //       t1.join();
        // } catch (Exception e) {
        //     System.out.println(e);
        // }
        t2.start();
    }
}