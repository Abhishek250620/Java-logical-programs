package progarming;

import java.util.Scanner;

public class GreatesOf3 {
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int a=ip.nextInt();
		int b=ip.nextInt();
		int c=ip.nextInt();
		System.out.print(a>b ? a>c?a:c : b>c?b:c);
		System.out.println(" is greater");
		ip.close();
	}
}