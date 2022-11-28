package array;
import java.util.Scanner;

public class Max{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		int max=0;
		int min=arr[0];
		int sum=0;
		System.out.print("Array elements:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			sum+=arr[i];
			if(max<arr[i]) {
				max=arr[i];
			}
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println();
		System.out.println("sum:"+sum);
		System.out.println("max:"+max);
		System.out.println("min:"+min);
	}
}
