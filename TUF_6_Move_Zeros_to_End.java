
import java.util.Arrays;

public class Move_Zeros_to_End {
    public static void main(String[] args) {
        int j = -1;
        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        for (int i = 0; i < arr.length; i++) 
        {
            if(arr[i]==0)
            {
                j=i;
                break;
            }
        }

        // if (j == -1)
        // {
        //    System.out.println(Arrays.toString(arr));
        // }

        for (int i = j+1 ; i < arr.length; i++) 
        {
            if(arr[i] !=0)
            {
                
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
                j++;
            }     
        }
     
        System.out.println(Arrays.toString(arr));
    } 
}
