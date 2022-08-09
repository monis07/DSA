import java.util.Arrays;
public class reverse_array {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        swap(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int arr[]){
        int l=arr.length;
        for(int i=0;i<l/2;i++){
            int temp=arr[i];
            arr[i]=arr[l-1-i];
            arr[l-1-i]=temp;
        }
    }
}
