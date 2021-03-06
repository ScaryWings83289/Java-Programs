// Write a Java Program to demonstrate Mouse events 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MouseEventExample {
    public static void main(String[] args) {
        new MouseListener();
    }
}
class MouseListener {
    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    public MouseListener(){
       prepareGUI();
       showMouseListener();
    }
    private void prepareGUI(){
       mainFrame = new JFrame("Mouse Events");
       mainFrame.setSize(400, 400);
       mainFrame.setLayout(new GridLayout(2, 1));

       mainFrame.addWindowListener(new WindowAdapter() {
           public void windowClosing(WindowEvent windowEvent) {
              System.exit(0);
           }
       });
       headerLabel = new JLabel("",JLabel.CENTER);
       statusLabel = new JLabel("",JLabel.CENTER);
       statusLabel.setSize(350,100);
       mainFrame.add(headerLabel);
       mainFrame.add(statusLabel);
       mainFrame.setVisible(true);
    }
    private void showMouseListener() {
       headerLabel.setText("--- MouseListener in action ---");
       mainFrame.addMouseListener(new CustomMouseListener());
       mainFrame.setVisible(true);
    }
    class CustomMouseListener implements java.awt.event.MouseListener {
        public void mouseClicked(MouseEvent e) {
            statusLabel.setText("Mouse Clicked:("+e.getX()+","+e.getY()+")");
        }
        public void mousePressed(MouseEvent e) {
            statusLabel.setText("Mouse Pressed !!!");
        }
        public void mouseReleased(MouseEvent e) {
            statusLabel.setText("Mouse Released !!!");
        }
        public void mouseEntered(MouseEvent e) {
            statusLabel.setText("Mouse Entered !!!");
        }
        public void mouseExited(MouseEvent e){
            statusLabel.setText("Mouse Exited !!!");
        }
    }
}
