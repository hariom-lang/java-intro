import java.util.*;
public class array {
    public static void main(String[] args) {
        int marks [] = new int [50];
        // input array
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the physics  marks :");
           marks[0] = sc.nextInt();
        System.out.print("Enter the chemstry marks :");
           marks[1] = sc.nextInt();
        System.out.print("Enter the math marks :");
           marks[2] = sc.nextInt();
        System.out.print("Enter the hindi marks :");
           marks[3] = sc.nextInt();   
       //output array
       System.out.println("physics = "+ marks[0]);
       System.out.println("chemistry = "+ marks[1]);
       System.out.println("math = "+ marks[2]);
       System.out.println("hindi = "+ marks[3]);
       //update array
       marks[3]= 10;
       System.out.println("updated mark of hindi = " + marks[3]);

       int parsentage = (marks[0]+ marks[1] + marks[2] +marks[3])/4;
       System.out.println("parsentage  = "+parsentage+"%");
       //array length
       System.out.println("length of array " + marks.length);
    }
}
