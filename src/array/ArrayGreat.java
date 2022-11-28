package array;

public class ArrayGreat {
	public static void main(String[] args) {
		int[] arr= {10,20,30};
		int a= arr[0]>arr[1] ? arr[0]>arr[2]?arr[0]:arr[2] : arr[1]>arr[2]?arr[1]:arr[2];
	System.out.println(a);
	}
}
