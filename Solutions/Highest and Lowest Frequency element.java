import java.util.HashMap;

public class Solution {
    public static int[] getFrequencies(int []v) {
        // Write Your Code Here
        int answer[]=new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<v.length;i++){
            map.put(v[i],map.getOrDefault(v[i],0)+1);
        }

        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int lowestElement=-1;
        int highestElement=-1;

        for(int i=0;i<v.length;i++){
            int value=map.get(v[i]);
            if(value>max){
            highestElement=v[i];
            max=value;
            }

            if(value<min){
                lowestElement=v[i];
                min=value;
            }
            

            if(value==max && v[i]<highestElement)
            highestElement=v[i];

            if(value==min && v[i]<lowestElement)
            lowestElement=v[i];

        }
        answer[0]=highestElement;
        answer[1]=lowestElement;

        return answer;
        
    }
}
