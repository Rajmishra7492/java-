class Ekclass{
    int a;
    public int getA(){
        return a;
    }
    Ekclass(int a){
        this.a = a;
    }
    public int returnone(){
        return 1; 
    }
}
public class thisandsuper {
    public static void main(String[] args) {
        Ekclass e = new Ekclass(5);
        System.out.println(e.getA());
        
    }
    
}
// this: is a refrence 