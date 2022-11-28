
package progarming;

import java.util.Scanner;

public class Duck {
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter number:");
		int n=ip.nextInt();
		int c=0;
		int rem=0;
		while(n!=0) {
			rem=n%10;
			if(rem==0) {
				c++;
				break;
			}
			n/=10;
		}
		if(c>0) {
			System.out.println("Duck number");
		}
		else {
			System.out.println("Not a duck number");
		}
	}
}
