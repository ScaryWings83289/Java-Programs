// Write a program to implement the concept of threading by implementing Runnable Interface 
class RunnableThread implements Runnable {
    public void run() {
        System.out.println("Thread Name: " + Thread.currentThread().getName());
        for(int i=0; i<5; i++)
            System.out.println(Thread.currentThread().getName() + ": " + i);
    }
}
public class RunnableExample{
    public static void main(String[] args) {
        RunnableThread rt1 = new RunnableThread();
        Thread t1 = new Thread(rt1);
        t1.start();
        RunnableThread rt2 = new RunnableThread();
        Thread t2 = new Thread(rt2);
        t2.start();
    }
}
