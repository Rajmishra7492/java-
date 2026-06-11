class myth1 extends Thread {
    public myth1(String name) {
        super(name);
    }

    @Override
    public void run() {
        int i = 0;
        while (i < 10){
            System.out.println("thank you" + getName());
        }
    }
}

// main priority = 1;
// normal priority = 5;
// max priority = 10;

public class threadPriority {
        public static void main(String[] args) {
        myth1 t1 = new myth1("raj1");
        myth1 t2 = new myth1("raj2");
        myth1 t3 = new myth1("raj3");
        myth1 t4 = new myth1("raj4");
        myth1 t5 = new myth1("raj5  (most important)");
        myth1 t6 = new myth1("raj6 ");
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.start();
        t4.start();
        t5.start();
        t6.start();
    }
}

