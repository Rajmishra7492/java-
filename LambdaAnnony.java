interface DemoAnnoy {
    void meth1();
//    void meth2();
}
//class RajFunk implements DemoAnnoy{
//
//
//    @Override
//    public void meth1() {
//        System.out.println("this is method 1");
//    }
//}
//
//class AnnonyDemo implements DemoAnnoy{
//    public void display(){
//        System.out.println("Hello");
//    }
//
//    @Override
//    public void meth1() {
//        System.out.println("i am meth 1");
//    }
//
//    @Override
//    public void meth2() {
//        System.out.println("i am meth 2 ");
//
//    }
//}
public class LambdaAnnony {

    static void main(String[] args) {
        // anonimous class
//        AnnonyDemo obj = new AnnonyDemo();
//        obj.meth1();
//        obj.meth2();
//        DemoAnnoy obj = new DemoAnnoy() {
//            @Override
//            public void meth1() {
//                System.out.println("i am meth 1");
//            }
//
//            @Override
//            public void meth2() {
//                System.out.println(" i am meth 2");
//
//            }
//        };
//        obj.meth1();
        //Lambda Expreexion
//        DemoAnnoy obj = new RajFunk();
//        obj.meth1();
        DemoAnnoy obj = ()->{
            System.out.println("i am the method of lambda class of meth 1");
        };
        obj.meth1();
    }
}
