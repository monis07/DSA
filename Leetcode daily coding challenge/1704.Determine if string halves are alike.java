class Solution {
    public boolean halvesAreAlike(String s) {
        int l=s.length();
        int count1=0;
        int count2=0;

        for(int i=0;i<l/2;i++){
            char ch=s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
            count1+=1;

            char ch1=s.charAt(i+(l/2));
            if(ch1=='a' || ch1=='e' || ch1=='i' || ch1=='o' || ch1=='u' || ch1=='A' || ch1=='E' || ch1=='I' || ch1=='O' || ch1=='U')
            count2+=1;
        }
        if(count1==count2)
        return true;

        return false;
    }
}
