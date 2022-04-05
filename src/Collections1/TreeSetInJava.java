package Collections1;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     TreeSet ts=new TreeSet();
     ts.add(30);//homogeneous will allow. heterogeneous not allow
     ts.add(100);
     ts.add(40);
     ts.add(20);
     ts.add(432);
     
     HashSet hs=new HashSet();
     hs.add(30);
     hs.add("Prajwal");
     hs.add("Prathik");
     hs.add(72);
     hs.add(null);
     
       
       System.out.println(ts);
     //  System.out.println(ts.retainAll(hs));//print true and compare and remove all different elements from tree
     System.out.println(ts.size());//here size is 5
     System.out.println(ts.pollFirst());//print and remove first element from the TreeSet
 //    System.out.println(ts.polllast());//print and remove last element from the TreeSet
     System.out.println(ts.size());//here size is 4
     System.out.println(ts);//default it will print ascending order
     //System.out.println(ts.descendingSet());//print descending order
     
	}

}
