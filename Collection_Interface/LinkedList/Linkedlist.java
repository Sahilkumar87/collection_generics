package LinkedList;
//package LinkedList;
import java.util.*;
public class Linkedlist {
    public static void main(String[] args) {
        List<Integer> lk = new LinkedList<>();
        lk.add(1);
        lk.add(2);
        lk.add(3);
        lk.add(4);
        lk.add(5);

        ListIterator<Integer> iterator = lk.listIterator();
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.previous());
    }
    
}
