
import java.util.*;

public class arrayList11 {
   public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(5);
        l2.add(25);
        l2.add(16);
        l2.add(18);

        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(6);
        l1.add(5);
        l1.add(0, 5);
        l1.add(0, 5);
        l1.addAll(l2);
        /* l1.clear(); */
        l1.set(1, 566);
        l1.iterator(); // return an iterator over the elements in the list in proper sequence.
        l1.isEmpty();// return ture if this list contains no elements.
        System.out.println(l1.lastIndexOf(5));
        System.out.println(l1.contains(13));
        System.out.println(l1.contains(16));
        System.out.println(l1.indexOf(5));
        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i));
            System.out.print("  ");

        }
    }

}
