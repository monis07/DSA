/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
    static void rotateArr(int arr[], int d, int n)
    {
        // add your code here
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
	public static void main(String[] args) {
	    int arr[]={2,4,6,8,10,12,14,16,18,20};
		rotateArr(arr,3,10);
		for(int i=0;i<n;i++)
		System.out.print(arr[i]+" ");
	}
}
