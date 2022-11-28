package array;

public class TwoArray {
	public static void main(String[] args) {
		int d=0;
		int[] a= {};
		int[] b= {12,3,4};
		int[] c=new int[a.length+b.length];
			for(int i=0;i<a.length;i++) {
				c[d]=a[i];
				d++;
			}
			for(int i=0;i<b.length;i++) {
					c[d]=b[i];
					d++;
				}
			System.out.println(c[0]+" "+c[1]);
	}
}
