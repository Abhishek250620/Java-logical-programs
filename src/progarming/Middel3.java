package progarming;

public class Middel3 {
	public static void main(String[] args) {
		String str="candy";
		if(str.length()>3){
		    int i=(str.length()-3)/2;
		    int j=i+3;
		    System.out.println(str.substring(i,j));
		  }
		  else{
		    System.out.println(str);
		  }
	}
}
