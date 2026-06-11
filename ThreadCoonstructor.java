class MyTh extends Thread{
    public MyTh(String name){
        super(name);
    }
    public void run(){
        int i =34;
        System.out.println("Thank You");
        // while(true){
        //     System.out.println("i am a tread");
        // }
    }
}



public class ThreadCoonstructor {
    public static void main(String[] args) {
        MyTh t1 = new MyTh("raj");
        
        t1.start();
        System.out.println( "the id of tread is :" + t1.getId());
        System.out.println( "the name of tread is :" + t1.getName());
    }
    
}
