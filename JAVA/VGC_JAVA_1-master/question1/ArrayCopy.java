/******************************************************************************

                           Question 1
• Write your own version of arraycopy for int arrays
 public static void arraycopy(int[] from,int fromstart, int[] to, int tostart, int count) { } 
Source: {54,21,90,23,35,36} to Destination: {90,23,35}
*******************************************************************************/

public class ArrayCopy
{
       //the method belows takes the content of one array and copies it to the other.
    	public static void arraycopy(int[] from,int fromStart, int[] to, int toStart, int count) { 
		   for(int i = fromStart; i < count; i++){
		    for (int k = toStart; k < to.length; k++){
		        to[k] = from[i];
		        i++;
		       
		    }
		    
		}
		
		    
		}  
	public static void main(String[] args) {
		int from[]= {54,21,90,23,35,36};
		
		// given the array new length to accomodate the new elements from the from[] array.
		int to[] = new int[3 + from.length];
		// the codes below populates the to array;
		to[0] = 90;
		to[1] = 23;
		to[2] = 35;
		// count specifies number of elements to be copied from the from[] array.
		int count = from.length;
		//indicates position to start copying into the to[];
		int toStart = 3;
		
           // indicates to position to start copying from from the from[]
		int fromStart = 0;
		
		
		
		
	
	// method call to arraycopy	
	    arraycopy(from,fromStart,to,toStart,count);
	    
		// printing the elements of toArray
                System.out.println("elements of the new to[] array");
		for(int i = 0; i < to.length; i++){
		    System.out.print(to[i] + " ");
		    
		}
		
	}
}

