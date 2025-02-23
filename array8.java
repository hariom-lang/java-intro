// print subarray 
public class array8 {
    public static void maxsumarray(int[] number) {
        int curr = 0;
        int max = Integer.MIN_VALUE;  // Initialize max to a very small number

        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i; j < number.length; j++) {
                int end = j;
                curr = 0;
                for (int k = start; k <= end; k++) {  // Correct the condition and variable
                    curr += number[k];
                }
                System.out.println(curr);
                if (max < curr) {
                    max = curr;
                }
            }
        }
        
        System.out.println("Maximum Sum: " + max);  // Print the maximum sum
    }

    public static void main(String[] args) {
        int number[] = {1, -2, 6, -1, 3};
        maxsumarray(number);
    }
}
