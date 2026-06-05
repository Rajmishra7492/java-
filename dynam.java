class phone{
    public void greet(){
        System.out.println("Good Morning");
    }
     public void name(){
        System.out.println("my name is java");
    }
}
class smartphone extends phone{
    public void swagat(){
        System.out.println("aapka swagat hai");
    }
    @Override
    public void name(){
        System.out.println("my name is java in class two");
    }
}
public class dynam {
    public static void main(String[] args) {
        // phone obj = new phone();
        // smartphone saobj = new smartphone();
        // obj.name();

        phone obj = new smartphone();
        obj.greet();
        obj.name();

        // subclasss refrecnce cannot be equall to superclass object
        // super obj = new subobj() - allowed
        //sub obj = new super() - not allowed
    }
}
