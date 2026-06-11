class practice3 extends Thread{
    @Override
    public void run(){
        while (true) { 
            try {
                Thread.sleep(200);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
            System.out.println("welcome");

        }
    }
}
class practice3b extends Thread{
    @Override
    public void run(){
        while (true) { 
            try {
                Thread.sleep(150);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
            System.out.println("good morining");
            
        }
    }
}
public class ThreadPractics {
    public static void main(String[] args) {
        practice3 c1 = new practice3();
        practice3b c2 = new practice3b();
        c1.start();
        c2.start();

    }
    
}
