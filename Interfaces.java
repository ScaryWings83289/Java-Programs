// Write a program to demonstrate use of implementing interfaces. 
interface Example {
    int CONST = 30;
    public void displayMssg();
    public void showConst();
}
class Implementation implements Example{
    public void displayMssg() {
        System.out.println("Display method");
    }
    public void showConst() {
        System.out.println("Interface constant value = " + CONST);
    }
}
public class Interfaces {
    public static void main(String[] args) {
        Implementation implement = new Implementation();
        implement.displayMssg();
        implement.showConst();
    }
} 
