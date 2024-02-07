public class Solution {
    public static int[] reverseArray(int n, int []nums) {
        // Write your code here.
        return calculate(n,nums,0);

    }
    public static int[] calculate(int n,int nums[],int i){
        if(i!=n/2){
            int temp=nums[i];
            nums[i]=nums[n-1-i];
            nums[n-1-i]=temp;
            i++;
            calculate(n,nums,i);
        }
        return nums;
    }
}
