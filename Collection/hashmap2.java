package Collection;

import java.util.HashMap;

public class hashmap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int arr[]= {5,5,4,3,2,2,1,1,1,7,8,9,8,7,4,5};
    HashMap<Integer,Integer> hm=new HashMap<>();
    for(int i=0;i<arr.length;i++) 
    	/*{
    	  if(hm.containsKey(arr[i])) 
    		hm.put(arr[i], hm.get(arr[i])+1);
        else
        	 hm.put(arr[i],1);	
    		} */
    	hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
       System.out.println(hm);
	}
	
	
}
