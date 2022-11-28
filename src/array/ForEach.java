package array;

public class ForEach {
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		int c=0;
		System.out.print("Array elements are: ");
		for(int ele: arr) {
			System.out.print(ele+" ");
			c++;
		}
		System.out.println();
		System.out.println("count of the array is: "+c);
	}
}
