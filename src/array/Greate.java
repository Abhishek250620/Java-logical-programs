package array;

import java.util.Scanner;

public class Greate {
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter array size:");
		int size=ip.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter array "+i+" position:");
			arr[i]=ip.nextInt();
		}
		ip.close();
		for(int i=0;i<arr.length;i++) {
			int val=-1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					val=arr[j];
					break;
				}
			}
			arr[i]=val;
		}
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
}
