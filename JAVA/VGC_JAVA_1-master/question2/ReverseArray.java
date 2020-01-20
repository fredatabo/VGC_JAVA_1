/******************************************************************************

Write a program that Reverse an array using swaps (Page 17) given the Array Below;

A={1,2,3,4,5,6,7,8,9} to B={9,8,7,6,5,4,3,2,1}

*******************************************************************************/

public class ReverseArray { 
  
    /*function swaps the array's first element with last element,  
      second element with last second element and so on*/
    static void reverse(int a[], int n) 
    { 
        int i, k, temp; 
        for (i = 0; i < n / 2; i++) { 
            temp = a[i]; 
            a[i] = a[n - i - 1]; 
            a[n - i - 1] = temp; 
        } 
  
        /*printing the reversed array*/
        System.out.println("Reversed array is: "); 
        for (k = 0; k < n; k++) { 
            System.out.print(a[k] + " "); 
        } 
    } 
  
    public static void main(String[] args) 
    { 
        int [] A = {1,2,3,4,5,6,7,8,9}; 
        reverse(A, A.length); 
    } 
} 
