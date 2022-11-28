package assignments;

import java.util.Scanner;

public class SumOfArr {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size:");
		int size=sc.nextInt();
		int sum=0;
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter array "+i+" position value");
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		sc.close();
		System.out.println("Sum of array-->"+sum);
	}
}
