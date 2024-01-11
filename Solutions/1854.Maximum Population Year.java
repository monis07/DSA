class Solution {
    public int maximumPopulation(int[][] logs) {
        //Effective solution
        int max1=1950;
        int p[]=new int[101];
        for(int i[]:logs){
            p[i[0]-1950]++;
            p[i[1]-1950]--;
            
        }
        int max=p[0];
        for(int i=1;i<101;i++){
            p[i]+=p[i-1];
            if(p[i]>max){
                max=p[i];
                max1=i+1950;
            }
        }
        return max1;
        
        // //Brute force approach
        // int l,max=0,max1=0;
        // int p[]=new int[101];
        // for(int i[]:logs){
        //     for(int j=i[0];j<i[1];j++){
        //         p[j-1950]++;
        //     }
        // }
        // for(int i=0;i<101;i++){
        //     if(p[i]>max){
        //         max=p[i];
        //         max1=i+1950;
        //     }
        // }
        // return max1;   
        
    }
}
