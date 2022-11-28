package progarming;

public class Prime {
	public static void main(String[] args) {
		int[] a= {2,2,10,5,7,1,3};
		int sum=0;
		for(int n=0;n<a.length;n++) {
			int count=0;
			for(int i=1;i<=a[n];i++) {
				if(a[n]%i==0) {
					count++;
				}
			}
			if(count==2) {
				sum+=a[n];
			}
		}
		System.out.println(sum);
	}
}

