/*Author'Name              : Bishal Mohapatra

 * Author's Regd No        : 2141013238
 * Author's Semester       : 1st
 * Author's branch  Section: CSE-17
 * Subject                 : Introduction To Computer Programming(CSE)
 * Problem description     : Assignment 2;Q_12
 * 
*/
import java.util.*;
public class Q_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the no of eggs here");
    Scanner sc = new Scanner(System.in);
    int eggs = sc.nextInt();
    int gross = eggs/144;
    int left_1 = eggs % 144;
    
    int dozens = left_1 / 12;
    int left_2 = left_1%12;
    
    System.out.println("Your no of eggsis "+gross+" gross "+dozens+" dozens "+left_2);
    
    
    
    
    
    
    
	}

}
