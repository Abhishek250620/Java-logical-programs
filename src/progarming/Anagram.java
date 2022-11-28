package progarming;

import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		String str1=ip.nextLine();
		String str2=ip.nextLine();
		ip.close();
		char[] str3=str1.toCharArray();
		char[] str4=str2.toCharArray();
		if(str1.length()==str2.length()) {
			for(int i=0;i<str3.length;i++) {
				for(int j=i;j<str4.length;j++) {
					if(str3[i]==str4[j]) {
						char temp=str4[i];
						str4[i]=str4[j];
						str4[j]=temp;
						break;
					}
				}
			}
			str2=new String(str4);
			System.out.println(str1.equals(str2)?"Anagram":"Not a Anagram");
		}
		else {
			System.out.println("Not a Anagram");
		}
	}
}