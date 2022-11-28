package progarming;
import java.util.Scanner;
public class DigitToBinary {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any no:");
		int no=sc.nextInt();
		sc.close();
		int[] arr=new int[40];
		int c=-1;
		while(no>=0) {
			c++;
			arr[c]=no%2;
			no/=2;
			if(no==0) {
				break;
			}
		}
		//System.out.println(str);
		for(int i=c;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}
}
