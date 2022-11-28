package progarming;

public class Abhi {
	public static void main(String[] args) {
		String str="xobin^bootcam";
		String str1="";
		int  temp=0;;
		if(str.length()>1&&str.length()<100) {
			for(int i=0;i<str.length();i++) {
				if(str.charAt(i)>='a'&&str.charAt(i)<='z') {
					if(str.charAt(i)=='z') {
						str1+=""+'a';
					}
					else if(str.charAt(i)+1=='a'&&str.charAt(i)+1=='i'&&str.charAt(i)+1=='e'&&str.charAt(i)=='o'&&str.charAt(i)+2=='u') {
						temp=(str.charAt(i)+1)-32;
						System.out.println(temp);
						str1+=""+temp;
					}
					else {
						temp=str.charAt(i)+1;
						str1+=""+temp;
					}
				}
				else {
					str1+=""+str.charAt(i);
			}

		}
	}
		//System.out.println(str1);
}
}
