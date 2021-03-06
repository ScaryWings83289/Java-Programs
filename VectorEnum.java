// Write a program to enumerate the element in the vector. 
import java.util.*; 
public class VectorEnum { 
    public static void main(String[] args) { 
        Vector<String> vec_tor = new Vector<String>(5); 
        vec_tor.add("Welcome"); 
        vec_tor.add("to"); 
        vec_tor.add("the"); 
        vec_tor.add("Paradise"); 
        vec_tor.add("Island"); 
        System.out.println("The Vector is: " + vec_tor); 
        Enumeration enu = vec_tor.elements();   
        System.out.println("The enumeration of values are:"); 
        while (enu.hasMoreElements()) { 
            System.out.println(enu.nextElement()); 
        } 
    } 
} 