/*Author'Name              : Bishal Mohapatra

 * Author's Regd No        : 2141013238
 * Author's Semester       : 1st
 * Author's branch  Section: CSE-17
 * Subject                 : Introduction To Computer Programming(CSE)
 * Problem description     : Assignment 2;Q_6
 * 
*/
 import java.util.*;
 
public class Q_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter weight in pounds :");
		System.out.println("Eneter hight in inches :");
		
		Scanner sc = new Scanner(System.in);
		
		    double weight = sc.nextDouble();
		    double height = sc.nextDouble();
		
		    double final_weight = weight * 0.45359237;
		    double final_height = height * 0.0254;
		
	        double BMI = final_weight / (final_height * final_height);
	
		  System.out.println("BMI is "+BMI);
     }

}
