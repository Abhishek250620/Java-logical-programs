package progarming;

import java.util.Scanner;

public class Arrayswift {
	
	static int [] arrayRotate(int n, int [] arr) {
		while(n!=0) {
			int temp =arr[0];
			arr[0] = arr[arr.length-1];
			for(int i=1;i<arr.length;i++) {
					int temp1;
					temp1=temp;
					temp = arr[i];
					arr[i]=temp1;					
				}
			n--;
			}
		return arr;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int rotateBy= s.nextInt();
		
		int [] b = {1,2,3,4,5,6};
		
		int a []= arrayRotate(rotateBy, b);

		
		
		
		for(int e : b) {
			System.out.print(e+" ");
		}
	}
}
