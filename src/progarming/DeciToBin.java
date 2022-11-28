package progarming;
import java.util.Scanner;
public class DeciToBin {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:-");
		int n=sc.nextInt();
		sc.close();
		int n1=n;
		int rem,ans=0,inc=1;
		while(n1!=0) {
			rem=n1%2;
			ans=(rem*inc)+ans;
			inc*=10;
			n1/=2;
		}
		System.out.println("Binary digit of "+n+" is:-"+ans);
	}

}
