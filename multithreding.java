// class MyThread extends Thread{
//     public void run(){
//         int i=0;
//         while (i<4000) { 
//             System.out.println("my thread is running");
//             System.out.println("i am happy!");
//             i++;
//         }
//     }
// }
// class MyThread2 extends Thread{
//     public void run(){
//         int i=0;
//         while (i<4000) { 
//             System.out.println("my thread2 is good ");
//             System.out.println("i am sad");
//             i++;
//         }
//     }
// }

class MYthreadRunable11 implements Runnable { 
    public void run() {
        System.out.println("i am a tread im not a tread 1");
    }
}

class MYthreadRunable211 implements Runnable { 
    public void run() {
        System.out.println("i am a tread im not a tread 2");
    }
}

public class multithreding {
    public static void main(String[] args) {
        // MyThread a1 = new MyThread();
        // MyThread2 a2 = new MyThread2();
        // a1.start();
        // a2.start();
        MYthreadRunable11 bullet1 = new MYthreadRunable11();
        Thread gun1 = new Thread(bullet1);
        MYthreadRunable211 bullet2 = new MYthreadRunable211();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }

}
