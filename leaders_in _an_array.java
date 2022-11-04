static void rotateArr(int arr[], int d, int n)
    {
        // add your code here
        //Efficient solution
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
        
}
static void reverse(int arr[],int low,int high){
    while(low<high){
        int temp=arr[low];
        arr[low]=arr[high];
        arr[high]=temp;
        low++;
        high--;
    }
}
