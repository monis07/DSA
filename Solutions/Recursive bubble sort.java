
public class Solution {
    public static void bubbleSort(int[] arr, int n) {
        //Your code goes here
        sort(arr,n-1);
    }
    public static void sort(int[] arr,int i){
        if(i==0)
        return;

        int j=0;
        while(j<=i-1){
            if(arr[j]>arr[j+1])
            {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
            j++;
        }
        sort(arr,i-1);
    }

}
