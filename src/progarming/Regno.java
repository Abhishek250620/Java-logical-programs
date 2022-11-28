package progarming;
import java.util.Scanner;

public class Regno {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String str=sc.nextLine();
		System.out.println("Enter sub string:");
		String str1=sc.next();
		int sp=1;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				sp++;
			}
		}
		String[] word=new String[sp];
		String str2="";
		int a=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				word[a]=str2;
				a++;
				str2="";
			}
			else {
				str2+=str.charAt(i);
			}
			word[a]=str2;
		}
		int c=-1;
		for(int i=0;i<word.length;i++) {
			if(word[i].equals(str1)) {
				c=i;
				break;
			}
		}
		if(c>-1) {
			System.out.println(c+1);
		}
		else {
			System.out.println("Name not found");
		}
	}
}
