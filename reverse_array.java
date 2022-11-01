import java.util.Arrays;
public class reverse_array {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        swap(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int arr[]){
        int l=arr.length;
        for(int i=0;i<l/2;i++){
            int temp=arr[i];
            arr[i]=arr[l-1-i];
            arr[l-1-i]=temp;
        }
    }
}
// import java.util.*;
// import java.lang.*;
// import java.io.*;
// class GFG
//  {
// 	public static void main (String[] args)
// 	 {
// 	 //code
// 	 Scanner in=new Scanner(System.in);
// 	 int t=in.nextInt();
// 	 for(int i=1;i<=t;i++){
// 	     int n=in.nextInt();
// 	     int arr[]=new int[n];
// 	     for(i=0;i<n;i++)
// 	     arr[i]=in.nextInt();
// 	     int low=0,high=n-1;
// 	     while(low<high){
// 	         int temp=arr[low];
// 	         arr[low]=arr[high];
// 	         arr[high]=temp;
// 	         low++;
// 	         high--;
// 	     }
// 	     for(i=0;i<n;i++)
// 	     System.out.print(arr[i]+" ");
// 	     System.out.println();
// 	 }
// 	 }
// }
