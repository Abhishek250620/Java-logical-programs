package assignments;

import java.util.Scanner;

public class StrPalindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String str=sc.next();
		String str1="";
		sc.close();
		for(int i=str.length()-1;i>=0;i--) {
			str1+=str.charAt(i);
		}
		if(str.equals(str1)) {
			System.out.println("palindrome");
		}
		else{
			System.out.println("Not palindrome");
		}
	}
}
