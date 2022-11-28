package progarming;

public class NoOvel {
	public static void main(String[] args) {
		String str="Abhishek";
		String str1="AEIOUaeiou";
		int count=0;
		String a="";
		String b="";
		for(int i=0;i<str.length();i++) {
			a=""+str.charAt(i);
			for(int j=0;j<str1.length();j++) {
				b=""+str1.charAt(j);
				if(a.equals(b)) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
