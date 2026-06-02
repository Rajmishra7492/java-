class MyEmploy {
    private int id;
    private String name;

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

public class access {
    public static void main(String[] args) {
        MyEmploy raj = new MyEmploy();
        // raj.id = 45;
        // raj.name = "Java class"; throws an error due to private access modifier
        raj.setName("Java lecture");
        System.out.println(raj.getName());
        raj.setId(16);
        System.out.println(raj.getId());

    }
}