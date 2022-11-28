package progarming;
import java.util.Scanner;
public class Amiti {
	static int cuc(String str) {
		char[] ch1=str.toCharArray();
		char[] ch2=str.toCharArray();
		int c=0;
		for(int i=0;i<ch1.length;i++) {
			for(int j=0;j<ch2.length;j++) {
				if(ch1[i]==ch2[j]&&i==j) {
					c++;
				}
				else if(ch1[i]==ch2[j]) {
					ch2[j]='\0';
				}
			}
		}
		return c;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st=sc.next();
		sc.close();
		int max=0;
		int c=0;
		for(int i=0;i<st.length();i++) {
			for(int j=st.length()-1;j>i;j--) {
				if(st.charAt(i)==st.charAt(j)) {
					c=cuc(st.substring(i+1,j));
				}
				if(max<c) {
					max=c;
				}
			}			
		}
		System.out.println(max);
	}
}