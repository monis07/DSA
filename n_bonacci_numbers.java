import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    int i;
	    int sum=1;
	    System.out.println("Enter m");
	    int m=in.nextInt();
		int arr[]=new int[m];
		System.out.println("Enter n");
		int n=in.nextInt();
		for(i=0;i<n;i++){
		    if(i==n-1)
		    arr[i]=1;
		    else
		    arr[i]=0;
		}
		for(i=n;i<m;i++){
		    arr[i]=sum;
		    sum-=arr[i-n];
		    sum+=arr[i];
		}
		for(i=0;i<m;i++)
		System.out.println(arr[i]);
	}
}
