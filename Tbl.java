// Suppose that a table named Table.txt is stored in a text file. The first line in the file header and the remaining lines correspond to row in the table. The elements are separated by commas. Write a Java program to display the table using labels in grid layout. 
import java.io.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
class A extends JFrame {
    public A() {
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GridLayout g = new GridLayout(0, 3);
        setLayout(g);
        try {
            FileInputStream fin = new FileInputStream("D:\\Table.txt ");
            Scanner sc = new Scanner(fin).useDelimiter(",");
            String[] arrayList;
            String a;
            while (sc.hasNextLine()) {
                a = sc.nextLine();
                arrayList = a.split(",");
                for (String i : arrayList) {
                    add(new JLabel(i));
                }
            }
        } 
        catch (Exception ex) {
        }
        setDefaultLookAndFeelDecorated(true);
        pack();
        setVisible(true);
    }
}
public class Tbl {
    public static void main(String[] args) {
        A a = new A();
    }
}