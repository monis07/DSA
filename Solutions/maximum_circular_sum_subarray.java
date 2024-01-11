//Efficient approach
//https://practice.geeksforgeeks.org/problems/max-circular-subarray-sum-1587115620/1
class Solution{

    // a: input array
    // n: size of array
    //Function to find maximum circular subarray sum.
    static int maxSum(int a[],int n){
        int sum=a[0];
        int max=a[0];
        for(int i=1;i<n;i++){
            sum=Math.max(a[i],a[i]+sum);
            max=Math.max(sum,max);
        }
         return max; 
        }
    static int circularSubarraySum(int a[], int n) {
        int max_normal=maxSum(a,n);
        if(max_normal<0)
        return max_normal;
        int arr_sum=0;
        for(int i=0;i<n;i++){
            arr_sum+=a[i];
            a[i]=-a[i];
        }
int max_circular=arr_sum+maxSum(a,n);
return Math.max(max_circular,max_normal);
    
}}
//Naive approach
        // int max1=a[0];
        // for(int i=0;i<n;i++){
        //     int sum=a[0];
        //     int max=a[0];
        //     for(int j=1;j<n;j++){
        //         sum=Math.max(a[j],a[j]+sum);
        //         max=Math.max(sum,max);
        //     }
        //     for(int k=1;k<n;k++){
        //         int temp=a[k];
        //         a[k]=a[k-1];
        //         a[k-1]=temp;
        //     }
        //     max1=Math.max(max1,max);
        // }
        // return max1;
