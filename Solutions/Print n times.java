import java.util.*;
public class Solution {
    public static List<String> printNtimes(int n){
        // Write your code here.
        List<String> list=new ArrayList<>();
        return calculate(n,list);
    }

    public static List<String> calculate(int n,List<String> list){
        if(n>0)
        {
        list.add("Coding Ninjas ");
        calculate(n-1,list);
        }
        return list;
}
    }
