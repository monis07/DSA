class Solution{
    //Function to find the days of buying and selling stock for max profit.
    ArrayList<ArrayList<Integer> > stockBuySell(int A[], int n) {
        // code here
        //Efficient solution
        int i;
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        for(i=1;i<n;i++){
            if(A[i]>A[i-1]){
            ArrayList temp=new ArrayList();
            temp.add(i-1);
            temp.add(i);
            list.add(temp);
            }
        }
        return list;
    }
}
