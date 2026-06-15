
// import java.util.ArrayList;
// import java.util.LinkedList;

import java.util.*;

public class LinkedList12 {
    public static void main(String[] args){
        // LINKED LIST:  a linear data structure where elements are not stored in contiguous (neighboring) memory locations
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(25);
        l2.add(16);
        l2.add(18);

        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(6);
        l1.add(9);
        l1.addFirst(5);
        l1.addAll(0,l2);
        l1.addLast(778);
        l1.addFirst(8888);

        /* l1.clear(); */
//        l1.set(1,566 );
//        l1.iterator(); // return an iterator over the elements in the list in proper sequence.
//        l1.isEmpty();// return true if this list contains no elements.
        System.out.println(l1.lastIndexOf(5));
        System.out.println(l1.contains(13));
        System.out.println(l1.contains(16));
        System.out.println(l1.indexOf(5));
//        for (int i = 0; i < l1.size(); i++) {
//            System.out.print(l1.get(i));
//            System.out.print(", ");
//        }
        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i));
            System.out.print(",  ");

        }
    }
}
