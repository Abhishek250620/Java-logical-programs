
package progarming;
import java.util.Scanner;

public class ReapetedString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int n=0;
		char[] arr1=str.toCharArray();
		char[] arr2=str.toCharArray();
		String temp="";
		for(int i=0;i<arr1.length;i++) {
			for(int j=arr2.length-1;j>=0;j--) {
				if(arr1[i]==arr2[j]) {
					for(int k=i+1;k<j;k++) {
						System.out.println(k);
						temp=""+arr1[k];
					}
				}
			}
		}
		System.out.println(temp);
	}
}
