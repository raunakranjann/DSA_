// Given an array,
//  the task is to find average of that array. 
//  Average is the sum of array elements divided by the number of elements.

public class Problem1 {
    public static void main(String[] args) {
        int[] arr = {32,2,23,21,21,12,34};
      int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i] ;
         
        }
        float average = (float)sum / arr.length;
        System.out.println("The average of the numbers stored in array is "+average+" ");
        
    }
}
