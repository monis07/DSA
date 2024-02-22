import java.util.* ;
import java.io.*; 
public class Solution {
	public static int countDistinctWayToClimbStair(long nStairs) {
		// Write your code here.
        int mod=1000000007;
		int a=0;
        int b=1;
        for(int i=2;i<=nStairs+1;i++){
            int c=a%mod+b%mod;
            a=b;
            b=c;
        }
        return b%mod;
	}
}
