package progarming;

public class Three {
	public static void main(String[] args) {
		int[] arr= {1,3,2,13,1};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==13) {
				arr[i+1]=0;
			}
			else {
				sum+=arr[i];
			}
		}
		System.out.println(sum);
	}
}
