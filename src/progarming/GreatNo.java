package progarming;

import java.util.TreeSet;

public class GreatNo {
	public static void main(String[] args) {
		int no=851;
		int no1=no;
		int c=0;
		while(no1!=0) {
			no1/=10;
			c++;
		}
		
		TreeSet<Integer> t=new TreeSet<Integer>();
		while(no!=0) {
			int rem=no%10;
			no/=10;
			t.add(rem);
		}
		System.out.println(t);
	}
}
