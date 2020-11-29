// Write a Java Program to implement Wrapper classes and their methods. 
public class WrapperClass
    {
    public static void main(String[] args)
        {
        Integer in1 = new Integer("28");
        Integer in2 = new Integer("88");
        Float f1 = new Float("32.52");

        System.out.println("Integer 1: " + in1);
        System.out.println("Integer 2: " + in2);
        System.out.println("Float 1: " + f1);
        System.out.println("Comparing integer 1 and 2: " + in1.compareTo(in2));
        System.out.println("Converting to String and concatenating integer 1 and 2: " + in1.toString() + in2.toString());
        System.out.println("Adding Integer to Float: " + (in1.floatValue() + f1));
        
    }
}
