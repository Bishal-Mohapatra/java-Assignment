/*Author'Name              : Bishal Mohapatra 

 * Author's Regd No        : 2141013238
 * Author's Semester       : 1st
 * Author's branch  Section: CSE-17
 * Subject                 : Introduction To Computer Programming(CSE)
 * Problem description     : Assignment 2;Q_15
 * 
*/
public class Q_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int result = (int)(Math.random()*b-a+1)+a;
		System.out.println(result);
	}

}

