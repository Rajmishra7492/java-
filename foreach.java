public class foreach{
    public static void main(String[] args){
        // String [] Student ={ "raj", "shubham", "lenevo",};
        // System.out.println(marks.length);
        // System.out.println(Student.length);

        int [] marks = {98,45,75,99,88};
        // Displaying the array for loop
        // for(int i=0 ; i<marks.length ; i++){
        //     System.out.println(marks[i]);
        // }
        // reverse printing an array
        // int [] marks = {98,45,75,99,88};
        // for(int i=marks.length -1 ;i>=0 ; i--){
        //     System.out.println(marks[i]);
        // }
        for (int element: marks){
            System.out.println(element);
        }
    }
}