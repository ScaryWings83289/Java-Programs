// Write a program to implement the concept of Exception Handling using predefined exception. 
public class ExceptionHandling 
{
    public static void main(String[] args) 
    {
        String[] arr = {"20", "string"};
        try 
        {
            int i1 = Integer.parseInt(arr[0]);
            int i2 = Integer.parseInt(arr[1]);
            int i3 = Integer.parseInt(arr[2]);
        }
        catch(NumberFormatException e) 
        {
            System.out.println("Number Format Exception");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array out of bounds");
        } 
        finally 
        {
            System.out.println("Finally Block");
        }
    }
} 
