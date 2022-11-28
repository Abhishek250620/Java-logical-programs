package progarming;
import java.util.Scanner;

public class MinToHours {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter min's");
		int n=sc.nextInt();
		sc.close();
		int c=0;
		if(n>1440) {
			System.out.println("Invalid time");
		}
		else {
			while(n>=60) {
				n-=60;
				c++;
			}
			System.out.println(c+" Hours: "+ n+ " mins");
		}
		
	}
}
