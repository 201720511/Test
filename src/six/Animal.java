package six;

public class Animal implements AnimalShouter {
	private String name;
	private int numOflegs;
	public static void main(String[] args) {
		
	}
	public Animal(){
		name="cat";
		numOflegs=4;
		System.out.println("Animal Constructor");
	}
	public Animal(String name,int numOflegs) {
		this.name=name;
		this.numOflegs=numOflegs;
		System.out.println("Animal Constructor");
	}
	public void namesetter(){
		this.name=name;
	}
	public String namegetter() {
		return name;
	}
	public void numOflegssetter(){
		this.numOflegs=numOflegs;
	}
	public int numOflegsgetter() {
		return numOflegs;
	}
	public void shout() {
		System.out.println("Animal Shout");
	}
	
}

