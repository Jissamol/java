class User {

	private String password;
	protected String role;
        public String username;                           
        public static final String SYSTEM_NAME = "AccessLogger"; 

   
        public User(String password,String role,String username) {
          
	    this.password=password;
            this.role = role;
            this.username = username;
 
        }
	public void showUserDetails(){

	System.out.println("Username: " +username);
        System.out.println("Role: " +role);
        System.out.println("SYSTEM_NAME: " +SYSTEM_NAME);
 	System.out.println("password: " +password);


	}
      }

public class UserAccessLogger{
   
    public static void main(String[] args) {
        User obj1 = new User("A1","admin", "jissa");
	System.out.println("Username: " +obj1.username);
       //System.out.println("Password: " + obj1.password);
	System.out.println("SYSTEM_NAME: " +obj1.SYSTEM_NAME);
	obj1.showUserDetails();
  
    }
}
