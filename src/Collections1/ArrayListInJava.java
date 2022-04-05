package Collections1;

import java.util.ArrayList;

public class ArrayListInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList al= new ArrayList();
    al.add("Asha");
    al.add(10);
    al.add("Swathi");
    al.add(20.39f);
    al.add(10);
    al.add('a');
    al.add(10);
    al.add(null);
    
    ArrayList al1= new ArrayList();
    al1.add("Yamini");
    al1.add("Sravanthi");
    al1.add(876);
    al1.add(1,"Friends");
    al.addAll(al1);
    //al.addAll(3,al1);
   // System.out.println(al.get(3));
    System.out.println(al.contains("Asha"));
    System.out.println(al.containsAll(al1));
    //al.clear();
    System.out.println(al.indexOf("Asha"));
    System.out.println(al.isEmpty());
    System.out.println(al.lastIndexOf(10));
    //al.remove(1);
    al.remove(null);
    //al.set(1, "And");
    System.out.println(al.size());
    
    
    
//    for(Object element:al) {
//    	System.out.println(element);
//    }
    System.out.println(al);
    System.out.println(al1);
    
	}

}
