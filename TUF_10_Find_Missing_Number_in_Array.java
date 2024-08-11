public class Find_Missing_Number_in_Array {
    
    public static int missingNumber(int[] arr , int N)
    {
        int xor1 =0 , xor2 =0;

        for(int i = 0; i < N-1; i++)
        {
            xor2 = xor2 ^ arr[i];
            xor1 = xor1 ^ (i+1);
        }
        xor1 = xor1 ^ N;
        return xor1 ^ xor2;
    }

    public static void main(String[] args) {
        int N = 5;
        int arr[] = { 1,2,4,5};

        int ans = missingNumber(arr, N);
        System.out.println(ans);
    }
}
