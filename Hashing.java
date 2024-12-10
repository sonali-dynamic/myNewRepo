import java.util.HashSet ;
import java.util.Iterator ;

public class Hashing{
    public static void main(String args[]){
		
		HashSet<Integer> set = new HashSet<Integer>();   // creating
		
		set.add(1);
		set.add(2);           // add
		set.add(3);
		set.add(1);
		
		// search = contains
		if(set.contains(1)){
			System.out.println("set contains 1");
		}
		
		if(!set.contains(6)){
			System.out.println("does not contains");
		}
		
		set.remove(1);
		if(!set.contains(1)){
			System.out.println("does not contains 1 - we deleted 1");
		}
		
		// Iterator ye ek symbol ya variable hota hota
		
	//	for(int i=0;i<=5;i++){    // i ek Iterator h     Iterator hashSet ke under hota h
		
		Iterator it = set.Iterator();    // Iterator ke do function hote h 1. hashNext 2. next  
		// ye hashSet function true false mai value return krta h
	    
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
