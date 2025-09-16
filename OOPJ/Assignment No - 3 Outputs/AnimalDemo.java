class Animal{
	void makeSound(){
		System.out.println("Animal Sound");
	}
}
class Dog extends Animal{
	void makeSound(){
		System.out.println("Bark");
	}
}
class Cat extends Animal{
	void makeSound(){
		System.out.println("Meow");
	}
}
class AnimalDemo{
	public static void main(String args[]){
		Dog d = new Dog();
	    Cat c = new Cat();
		d.makeSound();
		c.makeSound();
	}
}