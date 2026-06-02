
class MymainEmploy {

    private int id;
    private String name;

    public MymainEmploy() {
        id = 45;
        name = "Your name here";
    }

    public MymainEmploy(String myName, int myId) {
        id = myId;
        name = myName;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public void setId(int i) {
        id = i;
    }

    public int getId() {
        return id;
    }

}

public class constructor {
    public static void main(String[] args) {
        // MymainEmploy raj = new MymainEmploy("rajmishra", 12);
        MymainEmploy raj = new MymainEmploy();
        // raj.setName("rajmishra");

        // raj.setId(34);
        System.out.println(raj.getId());
        System.out.println(raj.getName());

    }
}
// contructor automatocally invoke
// wihtout any explitation
