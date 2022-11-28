package array;

public class SumOfPrime {
	public static void main(String[] args) {
		int [] a= {10,2,7,50};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			int n=1,count=0;
			while(n<=a[i]) {
				if(a[i]%n==0) {
					count++;
					n++;
				}
			}
			if(count==2) {
				sum+=a[i];
			}
		}
		System.out.println(sum);
	}
}
