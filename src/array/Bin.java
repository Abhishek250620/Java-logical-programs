package array;

public class Bin {
	public static void main(String[] args) {
		int index=0;
		int no=8;
		int[] arr=new int[20];
		while(no!=0) {
			int rem=no%2;
			no/=2;
			arr[index]=rem;
			
			index++;
		}
		for(int i=index-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}
}
