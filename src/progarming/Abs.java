package progarming;

import java.util.Scanner;

public class Abs {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int a=ip.nextInt();
		if(a<0) {
			System.out.println("Negative number");
			int b=-(a);
			System.out.println(b);
		}
		else if(a>0){
			System.out.println("Posituve number");
		}
		else{
			System.out.println("nuetral");
		}	
		ip.close();
	}
}