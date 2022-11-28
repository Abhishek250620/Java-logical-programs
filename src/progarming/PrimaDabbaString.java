package progarming;

public class PrimaDabbaString {
	static boolean primeNo(int n) {
		int c=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				c++;
			}
		}
		if(c==2) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		String word="hi bye";
		String[] str=word.split(" ");
		int max=str[0].length();
		int min=str[0].length();
		for(int i=0;i<str.length;i++) {
			if(max<str[i].length()) {
				max=str[i].length();
			}
			if(min>str[i].length()) {
				min=str[i].length();
			}
		}
		if(primeNo(min+max)) {
			System.out.println("Dabba String");
		}
		else {
			System.out.println("Not a dabba String");
		}
	}
}
