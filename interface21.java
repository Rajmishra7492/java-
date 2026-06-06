interface bicylce{
    int a= 45;
    void applyBreak(int decrement);
    void SpeedUp(int increment);
}
class Avoncycle implements bicylce{
    void blowhorn(){
        System.out.println(" pee , pee , pee");

    }
    public void applyBreak(int decrement){
        System.out.println("applying break");
    }
    public void SpeedUp(int increament){
        System.out.println("applyyin spped up");
    }
}
public class interface21{
    public static void main(String[] args) {
        Avoncycle cycleRaj = new Avoncycle();
        cycleRaj.applyBreak(1);
        System.out.println(cycleRaj.a);

    }
}
// we can extend multiple abstract class but we implement multiple interfaces at a time
// by using of interfaces we can create multiple classes
// you can create properties in interfaces
// you cannot modify the properties in interfaces as they are final
