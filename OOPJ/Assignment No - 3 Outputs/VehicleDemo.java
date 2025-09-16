class Vehicle {
	String brand;
	int speed;
	Vehicle(String brand, int speed){
		this.brand = brand;
		this.speed = speed;
	}
}
class Car extends Vehicle{
	String modelType;
	Car(String brand, int speed, String modelType){
	super(brand,speed);
	this.modelType = modelType;
	}
	void Display(){
		System.out.println("Car -> " + brand + " " + modelType + ", speed = " + speed);
	}

}
class Bike extends Vehicle{
	String modelType;
	Bike(String brand,int speed, String modelType){
	super(brand,speed);
	this.modelType = modelType;
	}
	void Display(){
		System.out.println("Bike -> " + brand + " " + modelType + ", Speed = " + speed);
	}
}
class VehicleDemo{
	public static void main(){
	Car c = new Car("Honda",180,"Civic");
	Bike b = new Bike("Yamaha",120,"R15");
	}
}