import java.util.ArrayList;
import java.util.Arrays;

public class Hashing {

	public static void main(String[] args) {
	
		int Arraysize = 13;
		int N = Arraysize;
		  
		  Integer[]hash = new Integer[N];
		
		  ArrayList <Integer> arraylist = new ArrayList<>(Arrays.asList(27,53,13,10,138,109,49,174,26,24));

		  for(Integer x : arraylist) {
		   
			  int pk = x.hashCode();
		      int ip = Math.abs(pk % N);
		    
		      if(hash[ip] != null) {
		     
		    	  int offset;
		          int q = pk/N;
		      
		      if(q % N != 0) {
		        
		    	  offset = Math.abs(q);
		      
		      }else {
		      
		    	  offset = 19;
		      }
		      
		      do {
		      System.out.println("Collison can not replace "+ x +" : "+ ip+ " is already occupied by "+ hash[ip]);
		        
		      ip = (ip + offset)% N;
		      
		      }while(hash[ip] != null);
		      
		    }
		      
		     hash[ip] = x;
		    
		     System.out.println( x +": "+ip);
		    
	}
		 }
}
