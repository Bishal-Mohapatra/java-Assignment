/*Author'Name              : Bishal Mohapatra

 * Author's Regd No        : 2141013238
 * Author's Semester       : 1st
 * Author's branch  Section: CSE-17
 * Subject                 : Introduction To Computer Programming(CSE)
 * Problem description     : Assignment 2;Q_9
 * 
*/
import java.util.*;

public class Q_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter x1 and y1 :");
        System.out.println("Enter x2 and y2 :");
       double x1 = sc.nextDouble();  
       double y1 = sc.nextDouble();   
       double x2 = sc.nextDouble();
       double y2 = sc.nextDouble();
       
       double a = (x2-x1)*(x2-x1) + (y2-y1)*(y2-y1);
        double ans = Math.sqrt(a);
         
        System.out.println("The distance between two points is "+ans);
	}

}
