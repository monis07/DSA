public class Solution {
    public static int[] printNos(int x) {
        // Write Your Code Here
        int arr[]=new int[x];
        return calculate(x,arr);
    }

    public static int[] calculate(int x,int arr[]){
        if(x>=1){
            arr[x-1]=x;
            calculate(x-1,arr);
        }

        return arr;
    }
}
