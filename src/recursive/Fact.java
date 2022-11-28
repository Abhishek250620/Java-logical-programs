package recursive;

public class Fact {
	static void sum(int n2) {
		if(n2>=1) {
			System.out.println(n2);
		}
		sum(n2-1);
	}
	public static void main(String[] args) {
		sum(10);
	}
}