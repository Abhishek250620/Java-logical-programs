package progarming;

public class DoWhile {
	public static void main(String[] args) {
		System.out.println("---Factorial---");
		int n=5;
		int fact=1;
		do {
			fact*=n;
			n--;
		}while(n>0);
		System.out.println(fact);
		System.out.println("---Reverse 1 to 10---");
		int i=10;
		do {
			System.out.println(i);
			i--;
		}while(i>0);
		System.out.println("Sum of n numbers using while");
		int d=20;
		int Sum=0;
		while(d>0) {
			Sum+=d;
			d--;
		}
		System.out.println(Sum);
	}
}