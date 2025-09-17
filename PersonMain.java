abstract class Person{
	private String name;
	private int ID;
Person(String name,int ID){
	name = name;
	ID = ID;
}
 public String getName() {
        return name;
    }

 public int getId() {
        return ID;
    }
public abstract void getRole();

}
class Student{
Student(String name,int ID){
	super(name,ID);
}
public String getRole(){
	return "Student";
}
}
class Professor{
Professor(String name,int ID){
	super(name,ID);
}
public String getRole(){
	return "Teacher";
}

}
public class PersonMain{
	public static void main(String[] args){
	Person student = new Student("Jissa", 101);
        Person professor = new Professor("Dr. Mathew", 201);

        System.out.println(student.getName() + " (ID: " + student.getId() + ") is a " + student.getRole());
        System.out.println(professor.getName() + " (ID: " + professor.getId() + ") is a " + professor.getRole());
    }
}