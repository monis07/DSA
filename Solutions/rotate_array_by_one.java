class Compute {
    
    public void rotate(int arr[], int n)
    {
        int t=arr[n-1];
        for(int i=n-1;i>=1;i--)
        arr[i]=arr[i-1];
        arr[0]=t;
    }
}
//Time complexity O(N)
//Space complexity O(1)
//https://practice.geeksforgeeks.org/problems/cyclically-rotate-an-array-by-one2614/1
