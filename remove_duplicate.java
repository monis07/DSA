class Solution {
    int remove_duplicate(int A[],int N){
        // code here
        //Efficient approach
        //Time complexity O(N)
        //Space complexity O(1)
        int res=1;
        for(int i=1;i<N;i++){
            //whenever arr[i] has got distinct element than last copied than we 
            //update value of next element from the element last updated
            if(A[i]!=A[res-1]){
                A[res]=A[i];
                res++;
            }
        }
        return res;
        //Naive approach 
        //Time and space complexity O(N)
        // int arr[]=new int[N];
        // arr[0]=A[0];
        // int res=1;
        // for(int i=1;i<N;i++){
        //     if(A[i]!=arr[res-1]){
        //         arr[res]=A[i];
        //         res++;
        //     }
        // }
        // for(int i=0;i<N;i++)
        // A[i]=arr[i];
        // return res;
    }
}
