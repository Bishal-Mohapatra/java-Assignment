/*Author'Name              : Bishal Mohapatra

 * Author's Regd No        : 2141013238
 * Author's Semester       : 1st
 * Author's branch  Section: CSE-17
 * Subject                 : Introduction To Computer Programming(CSE)
 * Problem description     : Assignment 2;Q_1
 * 
*/
 import java.util.*;
public class Q_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		System.out.println("enter degree in celcious :");
       
        Scanner sc = new Scanner(System.in);
        
          double c = sc.nextInt();                 //c = celcious.
          double ans = ((9.0/5)*c+ 32);
          
        System.out.println(c+" celcious is "+ans+" fahrenheit");
	}

}
