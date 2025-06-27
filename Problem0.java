// You are given an array arr[].
//  Your task is to count the number of even and odd elements. 
//  Return first odd count then even count.


public class Problem0 {
    public static void main(String[] args) {
        
     
        int[] arr = {3,5,2,6,1,23,43,53,23,121,12,24};
    
        int oddCount = 0, evenCount = 0;   
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Total Number of Odd Counts are "+ oddCount + " and Total even counts are " + evenCount);
        
        
    }
}
