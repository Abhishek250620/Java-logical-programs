package assignments;

import java.util.Scanner;

public class PrimeNo {
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter No:");
		int no=ip.nextInt();
		ip.close();
		int c=0;
		for(int i=1;i<=no;i++) {
			if(no%i==0) {
				c++;
			}
		}
		if(c==2) {
			System.out.println("Prime NO");
		}
		else {
			System.out.println("Not a Prime NO");
		}
	}
}
