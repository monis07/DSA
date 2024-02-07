import java.util.*;
public class Solution {
    public static List<Long> factorialNumbers(long n) {
        // Write Your Code Here
        List<Long> list=new ArrayList<>();

        long i=1;
        long sum=1;
        while(i*sum<=n){
            list.add(i*sum);
            sum*=i;
            i++;
        }
        return list;
    }
}
