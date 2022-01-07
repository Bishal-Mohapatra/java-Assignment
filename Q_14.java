/*Author'Name              : Bishal Mohapatra 

 * Author's Regd No        : 2141013238
 * Author's Semester       : 1st
 * Author's branch  Section: CSE-17
 * Subject                 : Introduction To Computer Programming(CSE)
 * Problem description     : Assignment 2;Q_14
 * 
*/
public class Q_14 {

	public static void main(String[] arr) {
		// TODO Auto-generated method stub
    int a,b;
         a = Integer.parseInt(arr[0]);
         b = Integer.parseInt(arr[1]);
         
          boolean x = (a%b==0)||(b%a==0);
          System.out.println(x);
         
	}

}
