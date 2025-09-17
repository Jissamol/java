abstract class vehicle{
abstract void startEngine();
void stopEngine(){
System.out.println("Vehicle engine stop");

}
}
class Car extends vehicle{
void startEngine(){
System.out.println("Car engine started");
}
}
class Bike extends vehicle{
void startEngine(){
System.out.println("Bike engine started");
}
}
public class mainVehicle{
	public static void main(String[] args){
	Car c = new Car();
	Bike b = new Bike();
	c.startEngine();
	c.stopEngine();
	b.startEngine();
	b.stopEngine();

}
}