/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    int i;
		System.out.println("Enter the size of array");
		int n=in.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter elements of array");
		for(i=0;i<n;i++)
		arr[i]=in.nextInt();
		int res=arr[0],count=1;
		for(i=1;i<n;i++){
		    System.out.print(res+"=");
		    if(arr[i]==res){
		    count++;
		    if(i==n-1)
		System.out.println(count);
		    }
		    else{
		        res=arr[i];
		        System.out.println(count);
		        count=1;
		    }
		}
	}
}
