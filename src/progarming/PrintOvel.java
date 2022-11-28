package progarming;

public class PrintOvel {
	public static void main(String[] args) {
		String str="ABHISHEK";
		String str1="AEIUO";
		String a="";
		String b="";
		for(int i=0;i<str.length();i++) {
			a=""+str.charAt(i);
			for(int j=0;j<str1.length();j++) {
				b=""+str1.charAt(j);
				if(a.equals(b)) {
				}
				else {
					System.out.println(b.charAt(j));
				}
			}
		}
	}
}