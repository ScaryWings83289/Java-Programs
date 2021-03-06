// Write a Java Program to demonstrate Keyboard event 
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
public class KeyListenerExample implements KeyListener {
    Label lb1, lb2;
    TextField tf1;
    Frame fr;
    String s;
    KeyListenerExample() {
        fr = new Frame("Key event listener");
        lb1 = new Label("Key events");
        lb2 = new Label();
        tf1 = new TextField(20);
        fr.setLayout(new FlowLayout());
        fr.add(lb1);
        fr.add(tf1);
        fr.add(lb2);
        tf1.addKeyListener(this);
        fr.setSize(460, 250);
        fr.setVisible(true);
    }   
    public void keyPressed(KeyEvent event) {
        lb2.setText("Key Pressed");
    }
    public void keyReleased(KeyEvent event) {
        lb2.setText("Key Released");
    }
    public void keyTyped(KeyEvent event) {
        lb2.setText("Key is pressed");
        fr.setVisible(true);
    }
    public static void main(String[] args) {
        new KeyListenerExample();
    }
}
