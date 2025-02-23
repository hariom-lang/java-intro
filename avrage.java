import java.util.*;
public class avrage {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Enter the value of a :");
        int a = sc.nextInt();

        System.out.print("Enter the value of b :");
        int b = sc.nextInt();
         
        System.out.print("Enter the value of c :");
        int c = sc.nextInt();

        int avrage = (a+b+c)/3;
        System.out.print ("avrage of all number :"+ avrage);
       
        
    }
}
