import java.util.*;
public class ArrayDeque31 {
    public static void main(String[] args){
        //Array Deque:  Aaray deque make interanlly an array for maintaing an array data for inserting and deleting an data 
        // inseting is doing at lastly meaming piche se insert karte hai value and aage se delete karte hai value ko 
        // double ended deque: isme kahi se bhi inserting and deletion kar sakte hai
        
                // ArrayDeque: initial capacity sufficient to hold an element is 16.
                // Array deque (int numElements)
        
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(6);
        ad1.add(56);
        ad1.add(9);
        ad1.addFirst(5);
        ad1.removeFirst();
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());

    }

}