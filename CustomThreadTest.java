// Write a program to implement the concept of threading by extending Thread Class 
class CustomThread extends Thread {
    public void run() {
        System.out.println("This is thread: " + getName());
        for(int i=0; i<5; i++)
            System.out.println(getName() + " : " + i);
    }
}
public class CustomThreadTest{
    public static void main(String[] args) {
        CustomThread t1 = new CustomThread();
        t1.start();
        
        CustomThread t2 = new CustomThread();
        t2.start();
    }
} 
