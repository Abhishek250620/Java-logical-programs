package recursive;

public class NthFibo {
	static int a=-1;
	static int b=1;
	static void fibo(int n) {
		if(n!=0) {
		int c=a+b;
		System.out.println(c);
		a=b;
		b=c;
		fibo(n-1);
		}
	}
	public static void main(String[] args) {
		fibo(10);
	}
}
