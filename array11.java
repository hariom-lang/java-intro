// print  maximum subarray sum using kanad algorithm
// we using kanad algorithm becouse it time complsity is mimimum
public class array11 {
        public static void kadansubarraysum(int number[]) {
            int currsum = 0;
            int maxsum = Integer.MIN_VALUE;
    
            for (int i = 0; i < number.length; i++) {
                currsum += number[i]; // Add current element to currsum
                
                if (currsum < 0) {
                    currsum = 0; // Reset currsum to 0 if it goes negative
                }
                
                maxsum = Math.max(currsum, maxsum); // Update maxsum if currsum is larger
            }
    
            System.out.println("Maximum subarray sum = " + maxsum);
        }
    
        public static void main(String args[]) {
            int number[] = {2, 3, 6, 7, 8,10};
            kadansubarraysum(number);
        }
    }

