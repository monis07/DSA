class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int l=mat.length;
        if(l>1){
        if(l%2==0){
            for(int i=0;i<l;i++)
                    sum+=mat[i][i]+mat[i][l-i-1];
        }
        else{
            for(int i=0;i<l;i++){
                if(l/2!=i)
                    sum+=mat[i][i]+mat[i][l-i-1];
                else
                    sum+=mat[i][i]; 
                }    
        }
            return sum;
        }
        else
            return mat[0][0];
        
    }
}
