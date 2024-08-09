public class Second_Largest_Element_Array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int Largest = arr[0];
        int SLargest = -1;

        for (int i = 1; i < arr.length; i++) 
        {
          if(arr[i] > Largest)
          {
            SLargest = Largest;
            Largest = arr[i];
          }  
          else if( arr[i] < Largest && arr[i] > SLargest)
          {
            SLargest = arr[i];
          } 
        }

        System.out.println(SLargest);
    }
}
