// Write a Java Program to implement Vector class and its methods. 
import java.util.*;
public class VectorClass{
    public static void main(String[] arsgs) {
        // initialize size is 3, increment is 2
        Vector v = new Vector(3,2);
        System.out.println("Initial Size: " + v.size());
        System.out.println("Initial Capacity: " + v.capacity());
        v.addElement(new Integer(1));
        v.addElement(new Integer(2));
        v.addElement(new Integer(3));
        v.addElement(new Integer(4));
        System.out.println("Capacity after 4 additions: " + v.capacity());
        v.addElement(new Double(5.45));
        v.addElement(new Integer(1));
        v.addElement(new Double(6.08));
        v.addElement(new Integer(7));
        System.out.println("Current Capacity: " + v.capacity());
        v.addElement(new Float(9.4));
        v.addElement(new Integer(10));
        System.out.println("Current Capacity: " + v.capacity());
        v.addElement(new Integer(11));
        v.addElement(new Integer(12));
        System.out.println("First Element " + (Integer) v.firstElement());
        System.out.println("Last Element " + (Integer) v.lastElement());
        if(v.contains(new Integer(3)))
            System.out.println("Vector contains 3");
        Enumeration vEnum = v.elements();
        System.out.println("\nElements in Vector:");
        while(vEnum.hasMoreElements()) {
            System.out.println(vEnum.nextElement());
        }
    }
}

