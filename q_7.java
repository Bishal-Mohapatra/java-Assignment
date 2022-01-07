/*Author'Name              : Bishal Mohapatra

 * Author's Regd No        : 2141013238
 * Author's Semester       : 1st
 * Author's branch  Section: CSE-17
 * Subject                 : Introduction To Computer Programming(CSE)
 * Problem description     : Assignment 2;Q_7
 * 
*/
import java.util.*;

public class q_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    System.out.println("Enter the side :");
    
    Scanner sc = new Scanner(System.in);
    
        double side = sc.nextDouble();
        
        double area = (3 * Math.sqrt(3))/2 * Math.pow(side,2);
        
    System.out.println("The area of the hexagon is "+area);
   }

}
