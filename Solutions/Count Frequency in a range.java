import java.util.HashMap;

public class Solution {
    public static int[] countFrequency(int n, int x, int []nums){
        // Write your code here.
        int arr[]=new int[n];
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<n;i++)
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);

        for(int i=1;i<=n;i++)
        arr[i-1]=map.getOrDefault(i,0);

        return arr;
    }
}
