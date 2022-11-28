package instaas;

public class LeftHigthest {
	public static void main(String[] args) {
		int arr[]= {5,6,3,8,4,15,7};
		for(int i=0;i<arr.length;i++) {
			int max=0;
			for(int j=0;j<=i;j++) {
				if(arr[j]>arr[i]) {
					max++;
				}
			}
			System.out.print(max+" ");
		}
	}
}
