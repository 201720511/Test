package six;

public class Dog extends Animal {

	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.shout();
		Animal dog1=new Dog();
		dog1.shout();
	}
	public void shout() {
		System.out.println("汪汪");  //Animal类getter方法
	}

}
//Animal类sette
//Animal类有参构造方法
//Animal类无参构造方法
//实现多态