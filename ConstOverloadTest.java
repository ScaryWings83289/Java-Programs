// Write a program for constructor overloading and overriding. 
class ConstOverload {
    ConstOverload() {
        System.out.println("Default Constructor");
    }
    ConstOverload(int a) {
        System.out.println("Parameterized Constructor");
    }
}
public class ConstOverloadTest {
    public static void main(String[] args) {
        new ConstOverload();
        new ConstOverload(5);
    }
}
