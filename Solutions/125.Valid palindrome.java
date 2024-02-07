class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String regex = "[^a-zA-Z0-9]";
        s=s.replaceAll(regex,"");
        if(s.length()==0)
        return true;

        String reverse= calculate(s,s.length());
        if(s.equals(reverse))
        return true;
        else
        return false;

    }
    public static String calculate(String str,int i){
        if(i==1){
            String value=str.charAt(i-1)+"";
            return value;
        }
        return str.charAt(i-1)+calculate(str,--i);
    }
}
