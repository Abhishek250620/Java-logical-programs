package assignments;

import java.util.Scanner;

public class ArmStrong {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no:");
		int n1=sc.nextInt();
		sc.close();
		int n2=n1;
		int n3=n1;
		int c=0;
		while(n2!=0) {
			c++;
			n2/=10;
		}
		int sum=0;
		while(n3!=0) {
			int rem=n3%10;
			int res=1;
			for(int i=0;i<c;i++) {
				res*=rem;
			}
			sum+=res;
			n3/=10;
		}
		if(sum==n1) {
			System.out.println("ArmStrong no");
		}
		else {
			System.out.println("Not ArmStrong no");
		}
	}
}
