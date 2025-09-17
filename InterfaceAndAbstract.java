abstract class Appliance{
abstract void onAppliance();
}
interface RemoteControl{
void control();
}
class TV extends Appliance implements RemoteControl{
public void onAppliance(){
System.out.println("Appliance is ON");
}
public void control(){
System.out.println("Remote controlling TV.");
}
}
class InterfaceAndAbstract{
public static void main(String[] args){
TV a1 = new TV();
a1.onAppliance();
a1.control();
}
}