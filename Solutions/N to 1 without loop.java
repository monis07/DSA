public class Solution
{
    public static int[] printNos(int x) {
        // Write Your Code Here
        int arr[]=new int[x];
        return calculate(x,arr,0);
    }
    public static int[] calculate(int x,int arr[],int i){
        if(x>=1){
            arr[i++]=x;
            calculate(x-1,arr,i);
        }
        return arr;
    }
}
