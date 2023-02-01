class Solution
{
    static int majorityElement(int a[], int size)
    {
        // your code here
        int res=0,count=1;
        for(int i=1;i<size;i++){
            if(a[res]==a[i])
            count++;
            else
            count--;
            if(count==0){
                res=i;
                count=1;
            }
        }
        count=0;
        for(int i=0;i<size;i++){
            if(a[res]==a[i])
            count++;
        }
        if(count<=size/2)
        return -1;
        return a[res];
    }
}
//Brute force approach
//  int curr=1;
//         int max=-1;
//         Arrays.sort(a);
//         for(int i=1;i<size;i++){
//             if(a[i]==a[i-1]){
//                 curr++;
//                 if(curr>size/2)
//                 max=a[i];
//             }
//             else
//             curr=1;
//         }
//         if(size!=1)
//         return max;
//         else
//         return a[0];
