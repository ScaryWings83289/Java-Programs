// Write a Program for JTable. 
import javax.swing.JFrame; 
import javax.swing.JScrollPane; 
import javax.swing.JTable;   
public class JTableExamples { 
    JFrame f; 
    JTable j; 
    JTableExamples() { 
        f = new JFrame();  
        f.setTitle("JTable Example"); 
        String[][] data = { 
            { "Divyankar Bhargav", "18BCS028", "CSE" }, 
            { "Vasu Dev Sall", "18BCS088", "CSE" } 
        }; 
        String[] columnNames = { "Name", "Entry No.", "Department" }; 
        j = new JTable(data, columnNames); 
        j.setBounds(30, 40, 200, 300);
        JScrollPane sp = new JScrollPane(j); 
        f.add(sp); 
        f.setSize(500, 200);  
        f.setVisible(true); 
    } 
    public static void main(String[] args) { 
        new JTableExamples(); 
    } 
} 