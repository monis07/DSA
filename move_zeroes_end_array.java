class Solution {
    void pushZerosToEnd(int[] arr, int n) {
        // code here
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[count];
                arr[count]=temp;
                count++;
                //If there is are two consecutive zeroes then count ++ will land on zero 
                //automatically or if there is only one zero then it will swap with non 
                //  zero element and will land on another index with same zero it has swapped
                // to another index
            }
        }
    }
}
//https://practice.geeksforgeeks.org/problems/move-all-zeroes-to-end-of-array0751/1
//Time complexity O(N)
//Space complexity O(1)
