public class Check_Array_Sorted {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int[] arr2 = {4,2,5,4,1,6,7,3};

        for (int i = 1; i < arr2.length; i++) 
        {
                if(arr2[i] > arr2[i-1])     // This condition bez array should not go out of index
                { }
                else
                {
                    System.out.println("Not Sorted");
                    break;
                }    
            
            System.out.println("Sorted Array");
        }
    }
}
