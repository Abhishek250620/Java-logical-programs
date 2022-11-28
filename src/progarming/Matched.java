package progarming;
public class Matched {
	public static void main(String[] args) {
		String str=")((()))";
		int c1=0;
		int c2=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='(') {
				c1++;
			}
			else {
				c2++;
			}
			if(c2>c1) {
				System.out.println("unmatched pair");
				break;
			}
		}
		System.out.println(c1==c2?"matched":"unmatched");
	}
}
