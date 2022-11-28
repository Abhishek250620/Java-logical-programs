package progarming;

import java.util.Scanner;

public class ArmStrong {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int n1=n;
		int n2=n;
		int count=0;
		int rem=0;
		int c=0;
		sc.close();
		while(n!=0) {
			count++;
			n/=10;
		}
		while(n1!=0) {
			rem=n1%10;
			int res=1;
			for(int i=1;i<=count;i++) {
				res=res*rem;
			}
			c+=res;
			n1/=10;
		}
		if(n2==c) {
			System.out.println("Armstrong number");
		}
		else {
			System.out.println("not a armstrong number");
		}
	}
}
