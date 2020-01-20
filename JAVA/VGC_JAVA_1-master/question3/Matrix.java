/******************************************************************************

                            Question 3
 • Write a program that converts a matrix A to a matrix B, where B[i][j] = A[j][i] 
[3,5,6]
[9,7,3]
[0,2,1]

*******************************************************************************/
import java.util.Arrays;
public class Matrix
{   // the method below, takes a two dimensional matrix, and changes the rows to columns.
    static void swapArray(int A[][],int i,int j){
      
        int B[][] = new int[i][j];
        for(int row  = 0; row < i; row++){
            
            for(int col = 0; col < j; col++ ){
                //A[row][col] = B[col][row];
                 B[col][row] = A[row][col];
            }
        }
        
        // printing the output
        
            // printing the output
        
        System.out.print("Array A ");
          System.out.println(Arrays.deepToString(A));
        
        System.out.print("Array B ");
          System.out.println(Arrays.deepToString(B));
    }
	public static void main(String[] args) {
	    
	  int A[][]={{3,5,6},{9,7,3},{0,2,1}};  
	  //method call to the swapArray method.
	  swapArray(A,3,3);
	    
		
	}
}

