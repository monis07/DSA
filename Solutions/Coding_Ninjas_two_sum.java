import java.util.HashMap;

public class Solution {
    public static String read(int n, int []book, int target){
        // Write your code here.
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int second=target-book[i];
            if(map.containsKey(second)){
                return "YES";
            }
            map.put(book[i],i);
        }
        return "NO";
    }
}
