interface Camera{
void takePhoto();
}
interface Phone{
void makeCall();

}
class Smartphone implements Camera, Phone{
void takePhoto(){
System.out.println("Photo taken.");
}
void makeCall(){
System.out.println("Calling 123-456-7890.");
}
}
public class mainInterface{
public static void main(String[] args){
Smartphone myPhone = new Smartphone();
        myPhone.takePhoto();  
        myPhone.makeCall();   
    }
}