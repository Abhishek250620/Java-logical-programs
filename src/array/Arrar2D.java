package array;

public class Arrar2D {
	public static void main(String[] args) {
		int[][][] arr= {{{10,20,40,80},{30,40,50,60}},{{10,39,49,68},{12,340,40,0}}};
		System.out.println(arr[0].length);
		System.out.println(arr[1].length);
		for(int i=0;i<arr[i].length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				for(int z=0;z<arr[j].length;z++)
				System.out.print(arr[i][j][z]+" ");
			}
			System.out.println();
		}
	}
}
