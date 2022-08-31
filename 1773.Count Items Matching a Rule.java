class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        //Efficient solution
        int index=0;
        if(ruleKey.equals("color"))
            index=1;
        else if(ruleKey.equals("name"))
            index=2;
        int count=0;
        for(List<String> item:items){
            if(item.get(index).equals(ruleValue))
                count+=1;
        }
        return count;
        
        
        
        
        
        
        //Brute force approach
       //  int k=0;
       //  for(List<String> item:items){
       //  if(ruleKey.equals("type")){
       //      if(item.get(0).equals(ruleValue))
       //          k+=1;
       //  }
       //  else if(ruleKey.equals("color")){
       //      if(item.get(1).equals(ruleValue))
       //          k+=1;
       //  }
       //      else{
       //          if(item.get(2).equals(ruleValue))
       //          k+=1;
       //      } 
       //  }
       // return k;
    }
}
