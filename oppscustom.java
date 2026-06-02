class employee{
    int id;
    String name;
    public void printDetails(){
        System.out.println("My id is " + id);
        System.out.println("and my name is "+ name);
    }
}
public class oppscustom{
    public static void main(String[] args){
        System.out.println("this is our custom class");
        employee raj = new employee();
        employee jon = new employee();
        // instantitating a new employeee objecct
        raj.id =12;
        raj.name= "rajJava";
        jon.id =13;
        jon.name= "jon mishra";

        raj.printDetails();
        jon.printDetails();
        // printing attributes
//        System.out.println(raj.id);
//        System.out.println(raj.name);
        // Attribute:Metadata or configuration tags assigned to code elements (classes, methods, or variables) to modify their behavior or provide runtime information
    }
}
