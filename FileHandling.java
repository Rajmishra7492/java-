import java.io.File;

public class FileHandling {
    static void main(String[] args) {
        /*
         * 
         * // File myFile = new File("raj.txt");
         * // try {
         * // myFile.createNewFile();
         * 
         * // }catch (IOException e){
         * // System.out.println("unable to create this file");
         * // e.printStackTrace();
         * // }
         * 
         * // code to write a file
         * 
         * // try{
         * // FileWriter fileWriter1 = new FileWriter("raj.txt");
         * // fileWriter1.
         * write("this is the first file which was written and made my java file handling"
         * );
         * // fileWriter1.close();
         * // }catch (IOException e){
         * // e.printStackTrace();
         * // }
         * 
         * // READING A FILE
         * File myFile = new File("raj.txt");
         * try {
         * Scanner sc = new Scanner (myFile);
         * while(sc.hasNextLine()){
         * String line = sc.nextLine();
         * System.out.println(line);
         * }
         * sc.close();
         * } catch (FileNotFoundException e) {
         * e.printStackTrace();
         * }
         */// deliting a file
            File myFile = new File("raj.txt");
        if (myFile.delete()){
            System.out.println("i have deleted :"+ myFile.getName());
        }
        else{
            System.out.println("some problem occurred while deleting the file");
        }
    }
}
