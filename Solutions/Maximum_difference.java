//Efficient solution
//Time complexity theta(N)
//Space complexity O(1)
class Solution
{
	public int maxDiffIndex(int A[], int N)
	{
	    if(N>1){
	    int res=A[1]-A[0];
	    int min=A[0];
	    for(int j=1;j<N;j++){
	        res=Math.max(res,A[j]-min);
	        min=Math.min(min,A[j]);
	    }
	    return res;
	}
	else
	return A[0];
	}
}
