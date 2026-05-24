public class breakcontinue{
    public static void main(String[]  args){
        for (int i=0; i<50; i++){


            System.out.println(i);


            if(i==2){
                System.out.println("Ending the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("java is great");
            }
            

        
        // int i=0;
        // while(i<5){
        //     System.out.println(i);
        //     System.out.println("Java is great");
        //     if(i==2){
        //         System.out.println("ending the loop");
        //         break;
        //     }
        //     i++;
        // }
        // System.out.println("Loop end here ");
    }

}