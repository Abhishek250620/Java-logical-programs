package assignments;

import java.util.Scanner;

public class NoVowel {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str="hellohieeeeaa";
		sc.close();
		int a=0;
		int e=0;
		int i=0;
		int o=0;
		int u=0;
		for(int j=0;j<str.length();j++) {
			if(str.charAt(j)=='a') {
				a++;
			}
			else if(str.charAt(j)=='e') {
				e++;
			}
			else if(str.charAt(j)=='i') {
				i++;
			}
			else if(str.charAt(j)=='o') {
				o++;
			}
			else if(str.charAt(j)=='u') {
				u++;
			}
		}
		System.out.println("a:"+a);
		System.out.println("e:"+e);
		System.out.println("i:"+i);
		System.out.println("o:"+o);
		System.out.println("u:"+u);
	}
}
