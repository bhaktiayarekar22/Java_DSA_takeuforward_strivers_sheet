
import java.util.Arrays;

public class Rotated_Array_by_Kth_Place {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {1,2,3,4,5};
        int k = 3;

        rotate(arr, n, k);

        System.out.println(Arrays.toString(arr));
    }

    static void rotate(int arr[], int n, int k)
    {
        k = k % n;

        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        reverse(arr,0,n-1);
    }
    static void reverse(int arr[], int start, int end)
    {
        while(start<end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
