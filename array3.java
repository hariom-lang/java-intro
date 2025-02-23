public class array3 {
    public static int findNum(int number[]){
       
        int largest = Integer.MIN_VALUE; // for reduce maximam value 
        int smallest = Integer.MAX_VALUE; // for reduce minimum value

        for (int i = 0; i < number.length; i++) {
            if ( largest < number[i] ){
               largest = number[i];

                }
                for (int j = 0; j < number.length; j++) {
                   if(smallest > number[i]) ;
                   smallest = number[i];
                }
        }
        System.out.println("the smallest value :" + smallest);
        return largest;
    }
    public static void main(String[] args) {
        int number [] = {1,2,3,4,5,6,7,43,76,213,1,4} ;
        System.out.println("the largest value :" + findNum(number));
    }
}
