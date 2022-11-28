//Next biggest element in array
package instaas;

public class NextBiggest {
	public static void main(String[] args) {
		int arr[]= {23,17,18,55,24,19,99,85,45,97,8};
		for(int i=0;i<arr.length;i++) {
			int max=-1;
			boolean flag=false;
			for(int j=i;j<arr.length;j++) {
				if(flag==false&&arr[j]>arr[i]) {
					flag=true;
					max=arr[j];
				}
				else if(flag==true&&arr[j]>arr[i]&&arr[j]<max) {
					max=arr[j];
				}
			}
			System.out.println(arr[i]+"->"+max);
		}
	}
}
