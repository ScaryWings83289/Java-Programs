// Write a Java Program to implement inheritance and demonstrate use of method overriding. 
public class Inheritance
{
    static class Parent 
    {
        void show() 
        {
            System.out.println("Parent Class!!");
        }
    }
    static class Child extends Parent 
    {
        @Override
        void show() 
        {
            System.out.println("Child Class!!");
        }
    }
    public static void main(String args[]) 
    {
        Parent p1 = new Parent();
        p1.show();
        Parent p2 = new Child();
        p2.show();
    }
} 
