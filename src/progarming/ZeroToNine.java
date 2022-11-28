package progarming;

public class ZeroToNine {
	public static void main(String[] args) {
		int n=123645;
		int n1=n;
		int res=0;
		String[] arr= {"zero","one","two","three","four","five","six","seven","eight","nine"};
		while(n1!=0) {
			int rem=n1%10;
			n1/=10;
			res=res*10+rem;
		}
		while(res!=0) {
			int rem=res%10;
			System.out.print(arr[rem]);
			res/=10;
		}
	}
}
