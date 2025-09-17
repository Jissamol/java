class Employee{
protected String name ="Alice";
protected int salary= 90000;
}
class Manager extends Employee{
void displayInfo(){
System.out.println("Name:"+name);
System.out.println("Salary:"+salary);
}
}
public class EmployeeDemo{
public static void main(String[] args) {
Manager e = new Manager();
e.displayInfo();

}
}