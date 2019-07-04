import java.util.*;


public class Sensorid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		 HashMap<Integer, Double> map = new HashMap<>(); 
         
	  
	        map.put(1, (double) 1); 
	        map.put(1, 1.34); 
	        map.put(1, 2.5); 
	        
	        map.put(2, (double) 2); 
	        map.put(2, 3.57); 
	        map.put(2, 9.8); 
	       
	          
	      //  System.out.println("Size of map is:- " + map.size()); 
	      
	        
	       Integer id = sc.nextInt();
	         
	       
	       
	       for(Map.Entry m:map.entrySet()){    
	    	   
	    	   if(id==m.getKey())
	    	   {
	    	   
	           System.out.println(m.getKey()+" "+m.getValue());    
	           
	    	   }
	          }  
	        
	        
	        map.clear(); 
	  
		
	/*
	        short udt_index=1;
	   	 short version_no=1;
	   	 double x_pos=1.34;
	   	 double y_pos=2.5;
	   	 double x_pos_sign=12;
	   	 double y_pos_sign=9;
	   	 double reserve=28 ;*/
		

	}

}
