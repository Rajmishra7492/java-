

class c1{
    public int x =65;
    protected int y = 45;
    int z = 6;
    private int a =76;
    public void meth(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a); 
        // chahe koi bhi modifier ho jaise private, protected, default, public, in saaron ko same class ke andar use kar sakta hun
    }
    
}
class c2 extends c1{


}

public class acessmodifier {
    public static void main(String[] args) {
        c1 c = new c1();
        // c.meth();
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
        // System.out.println(c.a); cannot be used because int a is private cannot used 
    }
    
}
