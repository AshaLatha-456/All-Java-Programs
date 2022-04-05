package Collections1;

import java.util.Hashtable;

public class HasTableInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable ht=new Hashtable();
	      ht.put(1,"Vinay");
	      ht.put(2,"Asha");
	      ht.put(3,"Prajwal");
	      ht.put(4,"Prathik");
	      ht.put(5, "Extra");
	      
	      
	      System.out.println(ht.containsKey(3));
	      System.out.println(ht.get(4));
	      for(Object id:ht.keySet()) {//this for loop we can use Heterogeneous
	    	  //System.out.println(id);//this will print only key
	    	  System.out.println("key="+id+" value="+ht.get(id));//Here print both key&value
	      }
	      System.out.println(ht);//by default it will print descending order
	}

}
