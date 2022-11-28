package assignments;

public class CircularPrime {
	public static boolean primeNo(int n) {
		int c=0;
		for(int i=1;i<=n;i++) {
			if(n%i==2) {
				c++;
			}
		}
		return c==2?true:false;
	}
	public static void main(String[] args) {
		int n=991;
		int swift=2;
		String str="";
		for(int i=0;i<swift;i++) {
			str=n%10+str;
			n/=10;
		}
	}
}
