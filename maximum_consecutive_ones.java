//Leetcode efficient solution
//https://leetcode.com/problems/max-consecutive-ones/submissions/
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int result=0;
        int curr=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
            curr=0;
            else{
                curr++;
                result=Math.max(result,curr);
            }
        }
        return result;
    }
}
