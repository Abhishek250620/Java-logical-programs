package recursive;

public class NthNumber {
	static void num(int n1,int n2) {
		if(n1<=n2) {
			System.out.println(n1);
			num(n1+1,n2);
		}
		
	}
	
	static void num2(int n1) {
		if(n1>0) {
			System.out.println(n1);
			num2(n1-1);
		}
	}
	public static void main(String[] args) {
		num(1,22);
		System.out.println("========");
		num2(22);
	}

}
