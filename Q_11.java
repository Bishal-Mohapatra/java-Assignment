/*Author'Name              : Bishal Mohapatra

 * Author's Regd No        : 2141013238
 * Author's Semester       : 1st
 * Author's branch  Section: CSE-17
 * Subject                 : Introduction To Computer Programming(CSE)
 * Problem description     : Assignment 2;Q_11
 * 
*/
import java.util.*;

public class Q_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc = new Scanner(System.in);
         double i = sc.nextDouble();
         double a = sc.nextDouble();
         double a_1 = a/1200;
         double n = sc.nextDouble();
         
         double future_investment = (1+a_1);
         double f = Math.pow( future_investment,n*12);  
         double ans = i*f;
         System.out.println("Accumulated value is "+ans);
         
	}

}
