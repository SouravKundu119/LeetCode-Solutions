//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java


import java.io.*;
import java.util.*;


class Array {
	public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int a[] = new int[n + 1];
            
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            
            Solution ob = new Solution();
            
            System.out.println(ob.findSum(a,n));
        }
        
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution
{ 
    public static int findSum(int arr[],int N) 
    {
        //code here
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        for(int i=0;i<N;i++){
            if(arr[i]>max)max=arr[i];
            if(arr[i]<min)min=arr[i];
        }
        return min+max;
    }
}
