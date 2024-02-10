//Recursive method
public class Solution {
    public static void insertionSort(int[] arr, int size) {
        //Your code goes here
        insertion(arr,0,size);
        }


public static void insertion(int arr[],int i,int size){
    if(i==size)
        return;

            for(int j=i;j>=1;j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                else
                break;
            }
            insertion(arr, i+1,size);
}}

//Iteration method
// public class Solution {
//     public static void insertionSort(int[] arr, int size) {
//         //Your code goes here
//         for(int i=0;i<size;i++){
//             for(int j=i;j>=1;j--){
//                 if(arr[j]<arr[j-1]){
//                     int temp=arr[j];
//                     arr[j]=arr[j-1];
//                     arr[j-1]=temp;
//                 }
//                 else
//                 break;
//             }
//         }
//     }
// }
