import java.util.*;
public class area {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the value of r :");
        float r = sc.nextFloat();

        float pai = 3.14f;
        
        float circal = pai*r*r;
        
        System.out.print("the area of circal :");
        System.out.print(circal);
    }
    
}
