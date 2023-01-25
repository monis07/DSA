//Efficient Solution O(n)
//https://practice.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1
class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        
        // Your code here
        int sum=arr[0];
        long max=arr[0];
        for(int i=1;i<n;i++){
            sum=Math.max(arr[i],arr[i]+sum);
            max=Math.max(sum,max);
        }
        return max;
        
    }
    
}

