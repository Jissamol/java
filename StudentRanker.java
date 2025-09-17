class Student{
    private String name;
    private double mark;
    Student(String n){
 	this.name = n;
	this.mark = 0;
	}
    Student(String n,double m){
        this.name = n;
        this.mark = m;
    }
    void setMarks(int m){
	mark = m;
	}
    String calculate(){
        if (mark>=90){
            return "A";
        } else if (mark >= 75) {
            return "B";
        } else if (mark >= 60) {
            return "C";
        }else if (mark >= 40) {
            return "D";
        }else{
            return "F";
        }

    }
    void display(){
        System.out.println("Name:"+name);
        System.out.println("Mark:"+mark);
        System.out.println("Grade:"+calculate());
    }
}
public class StudentRanker {
    public static void main(String[] args) {
        Student obj1= new Student("Jissa");
	obj1.setMarks(89);
        Student obj2= new Student("Sonat",75.5);
        obj1.display();
        obj2.display();

    }
}
