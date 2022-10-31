class Solution {
    int print2largest(int arr[], int n) {
        // code here
        int max=arr[0];
        int res=-1;
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                res=max;
                max=arr[i];
            }
            else if(arr[i]<max){
                if(arr[i]>res)
                res=arr[i];
            }
        }
        return res;
    }
}
