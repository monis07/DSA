class Solution {
    public int[][] transpose(int[][] matrix) {
        //Effective solution
        int r=matrix.length;
        int c=matrix[0].length;
        int[][] m=new int[c][r];
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                m[i][j]=matrix[j][i];
            }
        }
        return m;
        
    }
}
