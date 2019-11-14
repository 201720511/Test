package six;

public class Cat extends Animal {
	public Cat() {
		System.out.println("Cat Constructor");
	}
	public Cat(String name,int numOflegs) { 
		System.out.println("Cat Constructor");
	}

	public static void main(String[] args) {
		Animal animal=new Animal();
		Cat cat=new Cat();
		System.out.println(cat);
		cat.shout();
		Animal cat1=new Cat();
		cat1.shout();
	}
	public String toString() {
		return"Γ¨ΐΰ";
	}
	public void shout() {
		System.out.println("ίχίχ");
	}
}

