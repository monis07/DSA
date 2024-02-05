class Solution {
    public boolean isPalindrome(int n) {
        int num=n;
        if(num<0)
        return false;
        int rev=0;
        while(num!=0){
            int a=num%10;
            rev=rev*10+a;
            num/=10;
        }
        if(rev==n)
        return true;

        return false;
        
    }
}
