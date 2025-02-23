public class array1 {
    public static void argument(int marks[] , int num){
        num = 10;
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] +1 ;
        }
    }
    public static void main(String[] args) {
       int marks[] = { 99, 98 , 95};
       int num = 5;   // only array value change 
       argument(marks , num);   //call by reference only array not for value
       System.out.println(num); 
       for (int i = 0; i < marks.length; i++) {
           System.out.print(marks[i] +" ");
       }
       System.out.println();
    }
}
