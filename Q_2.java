/*Author'Name              : Bishal Mohapatra

 * Author's Regd No        : 2141013238
 * Author's Semester       : 1st
 * Author's branch  Section: CSE-17
 * Subject                 : Introduction To Computer Programming(CSE)
 * Problem description     : Assignment 2;Q_2
 * 
*/
import java.util.*;

public class Q_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  System.out.println("Enter the radious and length of a cylinder :");
		
      Scanner sc = new Scanner(System.in);
      
         double r = sc.nextDouble();
         double l = sc.nextDouble();
         
         double area = r * r * Math.PI;
         double volume = area * l;
         
      System.out.println("The area is "+area);
      System.out.println("The volume is "+volume);
      
	}

}
