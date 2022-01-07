/*Author'Name              : Bishal Mohapatra 

 * Author's Regd No        : 2141013238
 * Author's Semester       : 1st
 * Author's branch  Section: CSE-17
 * Subject                 : Introduction To Computer Programming(CSE)
 * Problem description     : Assignment 2;Q_10
 * 
*/
import java .util.*;
public class Q_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter three points for the triangle :");
  Scanner sc = new Scanner(System.in);
     double x1 = sc.nextDouble();
     double y1 = sc.nextDouble();
     double x2 = sc.nextDouble();
     double y2 = sc.nextDouble();
     double x3 = sc.nextDouble();
     double y3 = sc.nextDouble();
     
     double side_1 = (x2-x1)*(x2-x1) + (y2-y1)*(y2-y1);
     double a = Math.sqrt(side_1);
     double side_2 = (x3-x2)*(x3-x2) + (y3-y2)*(y3-y2);
     double b = Math.sqrt(side_2);
     double side_3 = (x3-x1)*(x3-x1) + (y3-y1)*(y3-y1);
     double c = Math.sqrt(side_3);
     
     
     double s  = (a+b+c)/2;
     
     double area_1 = (s*(s-a)*(s-b)*(s-c));
     
     double area = Math.sqrt(area_1);
     
     
     System.out.println("The area of the triangle is "+area);
     
     sc.close();
     
     
     
     
     
	}

}
