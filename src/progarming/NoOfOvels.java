package progarming;

public class NoOfOvels {
	public static void main(String[] args) {
		String str="Abhishek";
		String str2="aeiou";
		String str1="";
		int c=0;
		for(int i=0;i<str.length();i++) {
			str1=""+str.charAt(i);
			if((str1.equals("a"))||(str1.equals("e"))||
					(str1.equals("i"))||(str1.equals("o"))||(str1.equals("u"))||
					(str1.equals("A"))||(str1.equals("E"))||(str1.equals("I"))||
					(str1.equals("O"))||(str1.equals("U"))){
					continue;
					}
			else {
				System.out.println(str2.charAt(c));
				c++;
			}
		}
		
	}
}
