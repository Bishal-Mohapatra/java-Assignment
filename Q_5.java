/*Author'Name              : Bishal Mohapatra

 * Author's Regd No        : 2141013238
 * Author's Semester       : 1st
 * Author's branch  Section: CSE-17
 * Subject                 : Introduction To Computer Programming(CSE)
 * Problem description     : Assignment 2;Q_5
 * 
*/
import java.util.*;

 public class Q_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      System.out.println("Eneter v0,v1 and t :");
      
      Scanner sc = new Scanner(System.in);
      
         double v0 = sc.nextDouble();
         double v1 = sc.nextDouble();
         double t  = sc.nextDouble();
      
         double area = (v1 - v0)/t;
      
      System.out.println("The average accleration is "+area);
      
     }

}
