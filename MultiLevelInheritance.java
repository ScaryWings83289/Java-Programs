// Write a Java Program to implement multilevel inheritance by applying various access controls to its data members and methods. 
class A {
    public void display() {
        System.out.println("Class A");
    }
}
class B extends A {
    @Override
    public void display() {
        super.display();
        System.out.println("Class B");
    }
}
class C extends B {
    @Override
    public void display() {
        super.display();
        System.out.println("Class C");
    }
}
public class MultiLevelInheritance {
    public static void main(String[] args) {
        C c = new C();
        c.display();
    }
} 
