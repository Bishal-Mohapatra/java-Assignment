/*Author'Name              : Bishal Mohapatra 

 * Author's Regd No        : 2141013238
 * Author's Semester       : 1st
 * Author's branch  Section: CSE-17
 * Subject                 : Introduction To Computer Programming(CSE)
 * Problem description     : Assignment 2;Q_13
 * 
*/
import java.util.*;

public class Q_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc = new Scanner(System.in);
       System.out.println("Enter the no of mins her :");
       
       int mins = sc.nextInt();
       int years = mins / 525600;
        int days = mins % 525600;
        int days_1 = days / (24*60);
        
        System.out.println("1000000000 mins "+years+"years "+days_1+"Days");
   
   
   
   
   
   
	}

}
