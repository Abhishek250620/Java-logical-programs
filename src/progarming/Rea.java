package progarming;

public class Rea {
public static void main(String[] args) {
	int[] arr= {10,3,4,7,3,4,9,6,7};
	int[] arr1=arr;
	int sum=0;
	for(int i=0;i<arr.length;i++) {
		int c=0;
		for(int j=0;j<arr1.length;j++) {
			if(arr[i]==arr1[j]) {
				c++;
				arr1[j]=0;
			}
		}
		if(c>1) {
			sum+=arr[i];
		}
	}
	System.out.println(sum);
}
}
