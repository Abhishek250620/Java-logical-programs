package recursive;
public class oneToTen {
	static void rev(int n1,int n2) {
		if(n1<=n2) {
			System.out.println(n1);
			rev(n1+1,n2);
		}
	}
	public static void main(String[] args) {
		rev(1,10);
	}
}
