public class Solution {
    public static void insertionSort(int[] arr, int size) {
        //Your code goes here
        for(int i=0;i<size;i++){
            for(int j=i;j>=1;j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                else
                break;
            }
        }
    }
}
