//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int[] arr = new int[n];
            
            for (int i = 0; i < n; ++i)
                arr[i] = sc.nextInt ();

    		System.out.println (new Sol().search (arr, n));
        }
        
    }
}
// } Driver Code Ends


//User function Template for Java

class Sol
{
    public static int search(int A[], int N)
    {
        //Efficient approach using binary search
        
        int low=0,high=N-2;
        while(low<=high){
            int mid=(low+high)>>1;
            if(A[mid]==A[mid^1])
            low=mid+1;
            else
            high=mid-1;
        }
        return A[low];
    }
}


// // your code here
//         //Brute force approach
//         int k=A[0];
//         for(int i=1;i<N;i++){
//             if(i==1 && A[i]!=A[i-1]){
//             k=A[i-1];
//             break;
//             }
//             else if(i==N-1 && A[i]!=A[i-1]){
//                 k=A[i];
//                 break;
//             }
//             else if(i!=1 && i!=N-1 && A[i]!=A[i-1] && A[i]!=A[i+1]){
//             k=A[i];
//             break;
//             }
//         }
//         return k;


//Efficient approach using XOR operation
        // int ans=0;
        // for(int i=0;i<N;i++){
        //     ans^=A[i];
        // }
        // return ans;
