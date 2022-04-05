package Collections1;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       LinkedList ll=new LinkedList();
       ll.add(10);
       ll.add("Asha");
       ll.add("java");
       ll.add(5);
       ll.add(30);
       ll.add("Asha");
       ll.add(35.23f);
       
       ArrayList al1= new ArrayList();
       al1.add("Yamini");
       al1.add("Sravanthi");
       al1.add(876);
       al1.add(1,"Friends");
       
       ll.add(2,"Prathik");
       ll.addAll(al1);
       //ll.addAll(3,al1);
//       System.out.println(ll.getFirst());
//       System.out.println(ll.getLast());
       ll.addFirst("VINAY");
       ll.addLast("Asha");
       //ll.remove();
       //ll.remove(5);
       //ll.remove("Asha");
       //ll.removeFirst();
       //ll.removeLast();
       System.out.println(ll);
       //System.out.println(ll.removeFirstOccurrence("Asha"));
       ll.removeLastOccurrence("Asha");
//       System.out.println(ll);
//       ll.descendingIterator();
//       System.out.println(ll.element());
//       System.out.println(ll.getClass());
//       System.out.println(ll.offer("Prathik"));
       
       System.out.println(ll);
       
       
	}

}
