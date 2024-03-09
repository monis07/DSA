
public class Solution {
	
	public static void quickSort(int[] input,int low, int high) {
		if(low<high)
		{
			int partitionIndex=quick(input,low,high);
			quickSort(input, low, partitionIndex-1);
			quickSort(input, partitionIndex+1, high);
		}
	}

	public static int quick(int[] input, int low, int high){
		int pivot=input[low];
		int i=low;
		int j=high;

		while(i<j){

		while(input[i]<=pivot && i<=high-1)
		i++;

		while(input[j]>pivot && j>=low+1)
		j--;

		if(i<j){
			int temp=input[i];
			input[i]=input[j];
			input[j]=temp;
		}
		}

		int temp=input[j];
		input[j]=input[low];
		input[low]=temp;

		return j;
		
	}
	
}
