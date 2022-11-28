package progarming;

import java.util.Scanner;

//Counting the number of letters in given string

public class CountOfLetters {
	static int ll(String stt) {
		int w=0;
		char[] ch=stt.toCharArray();
		char[] ch1=stt.toCharArray();
		for(int m=0;m<ch.length;m++) {
			int c=0;
			for(int n=0;n<ch1.length;n++) {
				if(ch[m]==ch1[n]) {
					c++;
					ch1[m]='\0';
				}
			}
			if(c>1) {
				w+=c;
			}

		}
		return w;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		String str=sc.nextLine();
		sc.close();
		String arr[]=str.split(" ");
		int n=0;
		String r="";
		for(int i=0;i<arr.length;i++) {
			int rs=ll(arr[i]);
			if(rs>n) {
				n=rs;
				r=arr[i];
			}
		}
		System.out.println(n>0?r:"-1");
	}
}
