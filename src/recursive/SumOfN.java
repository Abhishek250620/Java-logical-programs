package recursive;

public class SumOfN {
	static int add=0;
	static int sum(int n) {
		if(n>0) {
			add+=n;
			sum(n-1);
		}
		return add;
	}
	public static void main(String[] args) {
		System.out.println(sum(10));
	}
}