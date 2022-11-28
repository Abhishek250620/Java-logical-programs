//First half desc and second half asc
package instaas;

public class HalfAscDes {
	public static void main(String[] args) {
		int[] arr= {34,2,12,45,10,67};
		int mid=arr.length/2;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<mid;j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
			if(i>=mid) {
				for(int k=i+1;k<arr.length;k++) {
					if(arr[i]>arr[k]) {
						int temp=arr[i];
						arr[i]=arr[k];
						arr[k]=temp;
					}
				}
			}
		}
		for(int ele:arr) {
			System.out.print(ele+" ");
		}
	}
}
