/*Author'Name              : Bishal Mohapatra

 * Author's Regd No        : 2141013238
 * Author's Semester       : 1st
 * Author's branch  Section: CSE-17
 * Subject                 : Introduction To Computer Programming(CSE)
 * Problem description     : Assignment 2;Q_4
 * 
*/
import java.util.*;

public class Q_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.out.println(" Enter the no between 0 and 1000 :");
		  
		  Scanner sc = new Scanner(System.in);
		  
		      int digit = sc.nextInt();
		  
		      int ones = digit % 10;
		      int remaining_1 = digit / 10;
		  
		      int tens = digit % 10;
		      int remaining_2 = digit / 10;
		  
		      int hundreds = remaining_2 / 10;
		      
		      int sum = ones+tens+hundreds;
		   
		  System.out.println("The sum of the digits "+sum);

	}

}
