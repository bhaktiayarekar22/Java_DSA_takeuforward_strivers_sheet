public class Largest_Element_Array{
    public static void main(String[] args) {
        int[] arr = {1,2,5,3,2,4,3};
        
        int Largest = arr[0];
        for (int i = 0; i < arr.length; i++) 
        {
            if(arr[i] > Largest)
            {
                Largest = arr[i];
            }
        }
        System.out.println(Largest);

    }
}