package progarming;

public class EqualsHashcode {
	String name;
	int age;
	public EqualsHashcode(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public int hashCode() {
		return 312432;
	}

	@Override
	public String toString() {
		return "Abhishek";
	}
	
	@Override
	public boolean equals(Object obj) {
		EqualsHashcode e1=(EqualsHashcode) obj;
		return this.name==e1.name&&this.age==e1.age;
	}
	public static void main(String[] args) {
		EqualsHashcode e=new EqualsHashcode("Preethi", 23);
		EqualsHashcode e2=new EqualsHashcode("Preethi", 23);
		System.out.println(e);
		System.out.println(e.name+" "+e.age);
		System.out.println(e.equals(e2));
		System.out.println(e.hashCode());
	}
}