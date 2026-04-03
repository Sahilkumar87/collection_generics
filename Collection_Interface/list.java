// package Collection_Interface;
import java.util.*;
/*
list methods
 E get(int index)
 E set(int index, E element)
 void add(int index, int element)
 boolean add(int index, Collection<? extends E> c)
 E remove(int index)


 impletation of list
 ArrayList - array ka size pata na ho tab use kerna
 LinkedList - 
 VectorList
  ArrayList vs LinkedList
  
*/

public class list {
    public static void main(String[] args) {
        
    List<Integer> alist = new ArrayList<>();
    alist.add(1);
    alist.add(2);
    alist.add(3);
    alist.add(4);
    System.out.println(alist);
    System.out.println("element that got replaced = " + alist.set(1,8));

    List<Integer> alist2 = new ArrayList<>(alist);
    alist2.add(5);
    alist2.add(6);
    System.out.println(alist2);

    alist2.addAll(alist);
    System.out.println(alist2);


    List<Integer> alist3 = alist2.subList(2, 6);
    System.out.println(alist3);
    }
}
