package Collections1;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      HashMap hm=new HashMap();
      hm.put(1,"Vinay");
      hm.put(2,"Asha");
      hm.put(3,"Prajwal");
      hm.put(4,"Prathik");
      hm.put(5, "Extra");
      
      
//      System.out.println(hm);
//      System.out.println(hm.containsKey(3));//if given key is there print true otherwise print false
//      System.out.println(hm.containsValue("Asha"));//if given value is there print true otherwise print false
//      System.out.println(hm.get(4));//print value of given key
//      System.out.println(hm.remove(5));remove key&value of given key
      
//      
//      for(Entry<Integer, String> entry:hm.entrySet()) {//this for we can use for only Homogeneous
//    	  System.out.print("key="+entry.getKey());
//    	  System.out.println(" value="+entry.getValue());
//      }
      for(Object id:hm.keySet()) {//this for loop we can use Heterogeneous
    	  //System.out.println(id);//this will print only key
    	  System.out.println("key="+id+" value="+hm.get(id));//Here print both key&value
      }
      for(Object name:hm.values()) {
    	  System.out.println(name);//here print only names
      }
      System.out.println(hm);
      
	}

}
