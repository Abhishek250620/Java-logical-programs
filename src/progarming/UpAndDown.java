package progarming;

class Father{
	int age=59;
	void work(){
		System.out.println("Father is working");
	}
}

class Son extends Father{
	int sonsAge=27;
	void Work() {
		System.out.println("Son is Not working");
	}
}

public class UpAndDown {
	public static void main(String[] args) {

		char a='S';
		int b=a;
		System.out.println(a+"  "+b);

		int c=67;
		char d=(char)c;
		System.out.println(c+" "+d);


		Father f=new Son();
		Son s=(Son)f;
		System.out.println("Fathers age:"+f.age);
		f.work();
		System.out.println("Fathers age:"+s.age);
		System.out.println("Sons age:"+s.sonsAge);
		s.Work();
	}
}