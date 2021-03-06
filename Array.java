// Write a Java Program to implement array of objects. 
public class Array {
    public static class Inner {
        private final int id;
        Inner(int id) {
            this.id = id;
        }
        void display() {
            System.out.println("Object Id: " + this.id);
        }
    }
    public static void main(String[] args) {
        Inner[] arr = new Inner[10];
        for(int i = 0; i< 10; i++)
            arr[i] = new Inner(i + 1);
        
        System.out.println("Displaying array of objects: ");
        for(int i = 0; i<10; i++)
            arr[i].display();
    }
}

