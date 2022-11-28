package progarming;

import java.util.Scanner;

public class Nthprimeno {
	static boolean primeNo(int n) {
		int c=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				c++;
			}
		}
		if(c==2) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in); 
		System.out.println("Enter no:");
		int no=sc.nextInt();
		sc.close();
		int c=0;
		for(int i=1;;i++) {
			if(primeNo(i)) {
				c++;
			}
			if(c==no) {
				System.out.println(i);
				break;
			}
		}
	}
}
