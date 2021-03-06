// Write a java program to find the details of the students eligible to enroll for the examination ( Students, Department combinedly give the eligibility criteria for the enrollement class) using interfaces 
import java.util.Scanner;
interface Student{
    int studentID = 28;
    String studentName = "Divyankar";
    String Class = "CSE" ;
    void getValue();
}
class Department implements Student{
    int attendance;
    public void getAttendance(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Attendance: ");
        attendance = sc.nextInt();
    }
    public void getValue(){
        System.out.println("ID :" + studentID + "\nName :" + studentName + "\nClass : " + Class);
    }
}
class Exam extends Department{
    public void calculateAttendance(){
        attendance = attendance;
    }
    public boolean eligible(){
        if(attendance < 60)
            return false;
        else
            return true;
    }
}
public class Examination{
    public static void main(String[] args){
        Exam e = new Exam();
        e.getValue();
        e.getAttendance();
        e.calculateAttendance();
        System.out.println("Eligibility :" + e.eligible());
    }
}
