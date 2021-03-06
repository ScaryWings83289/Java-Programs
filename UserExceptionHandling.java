// Write a program to implement the concept of Exception Handling by creating user defined exceptions. 
class UserException extends Exception {
    String mssg;
    UserException(String mssg) {
        this.mssg = mssg;
    }
    public String toString() {
        return "UserException occured: " + mssg;
    }
}
public class UserExceptionHandling {
    public static void main(String[] args) {
        try {
            System.out.println("Try block: ");
            throw new UserException("Custom error message");
        } catch(UserException e) {
            System.out.println(e);
        }
    }
} 
