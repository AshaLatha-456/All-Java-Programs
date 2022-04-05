package Collections1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class HashSetInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     HashSet hs=new HashSet();
     hs.add(30);
     hs.add("Prajwal");
     hs.add("Prathik");
     hs.add(72);
     hs.add(null);
     
     ArrayList al1= new ArrayList();
     al1.add(null);
     al1.add("Vinay");
     al1.add(876);
     al1.add(1,"Friends");
     
     LinkedList ll=new LinkedList();
     ll.add(10);
     ll.add("Asha");
     ll.add("java");
     ll.add(30);
     
     
//     for(Object element:hs) {
//    	 System.out.println(element);
//     }
     //hs.removeIf(null);
     System.out.println(hs.size());
     System.out.println(hs.equals(al1));
    // System.out.println(hs.hashCode());
    System.out.println(hs.addAll(ll));
     System.out.println(hs);
     System.out.println(hs.size());
     
     
	}

}
