package array;

public class ZeroExchange {
	public static void main(String[] args) {
		int[] arr1= {1,0,3,4,0,5,6,7,0,0,6,8,0};
		int[] arr2=new int[arr1.length];
		int k1=arr2.length-1;
		
		for(int i=arr1.length-1;i>=0;i--) {
			if(arr1[i]!=0) {
				arr2[k1]=arr1[i];
				k1--;
			}
		}
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr2[i]+" ");
		}
	}
}