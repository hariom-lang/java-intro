public class array7 {
   public static void subarray(int number []){
    int ts =0;
   for (int i = 0; i <number.length; i++) {
    int start = i ;
    for (int j = i;  j < number.length; j++) {
        int end = j;
        for (int k = start; k <= end; k++) {
            System.out.print(number[k]);
        
            
        }
        System.out.println();
        ts++;

    }
         System.out.println();
         

   }
   System.out.println("total subarray =" + ts);
   }
   public static void main(String[] args) {
       int number [] = {2, 4, 6, 8, 10};
       subarray(number);
   }
}
