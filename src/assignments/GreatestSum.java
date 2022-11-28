package assignments;

public class GreatestSum {
	public static void main(String[] args) {
		int[]  arr= {11,4,5,8,99,9,8,7,1};
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=i+1;j<arr.length;j++) {
				sum+=arr[j];
			}
			if(sum>arr[i]) {
				arr[i]=sum;
			}
		}
		for(int ele:arr) {
			System.out.print(ele+" ");
		}
	}
}
