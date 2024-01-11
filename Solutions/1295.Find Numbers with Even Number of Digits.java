class Solution {
    public int findNumbers(int[] nums) {
        //Efficient solution
        int c=0;
        for(int i:nums){
            if((i>=10 && i<=99)|| (i>=1000 && i<=9999)||(i==100000))
                c+=1;
        }
        return c;
    }
}
