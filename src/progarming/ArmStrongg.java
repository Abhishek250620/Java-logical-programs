package progarming;

public class ArmStrongg {
	public static void main(String[] args) {
		int no=139;
		int n1=no;
		int n2=no;
		int c=0;
		for(int i=0;n1!=0;i++) {
			n1/=10;
			c++;
		}
		int sum=0;
		while(n2!=0) {
			int rem=n2%10;
			int res=1;
			for(int i=0;i<c;i++) {
				res*=rem;
			}
			n2/=10;
			sum+=res;
		}
		System.out.println(sum==no? "Arm Strong no":" Not ArmStrong no");
	}
}
