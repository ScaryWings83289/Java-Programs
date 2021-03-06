// Write a program that creates a user interface to perform integer divisions. The user enters two numbers in the text fields, Num1 and Num2. The division of Num1 and Num2 is displayed in the Result field when the Divide button is clicked. If Num1 or Num2 were not an integer, the program would throw a NumberFormatException. If Num2 were Zero, the program would throw an Arithmetic Exception Display the exception in a message dialog box. 
import java.awt.*;
import java.awt.event.*;
public class UIDivision extends Frame{
    TextField field1, field2;
    Label label1, label2, result, resultInfo, dLabel;
    Button btn, dBtn;
    Dialog d;
    UIDivision() {
	super(" Number Division ");
        setSize(500, 300);
        setLayout(null);
        setVisible(true);
        addWindowListener(new WindowAdapter(){  
            public void windowClosing(WindowEvent e) {  
                dispose();  
            }  
        });
        
        field1 = new TextField();
        field1.setBounds(200, 100, 250, 20);
        add(field1);
        field2 = new TextField();
        field2.setBounds(200, 130, 250, 20);
        add(field2);
        
        label1 = new Label("Number 1: ");
        label1.setBounds(50, 100, 100, 20);
        add(label1);
        label2 = new Label("Number 2: ");
        label2.setBounds(50, 130, 250, 20);
        add(label2);
        resultInfo = new Label("Result: ");
        resultInfo.setBounds(50, 200, 100, 20);
        add(resultInfo);
        result = new Label("");
        result.setBounds(200, 200, 250, 20);
        add(result);
        
        btn = new Button("Compute");
        btn.setBounds(200, 160, 100, 20);
        add(btn);
        btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                try {
                    if(field1.getText().isEmpty() || field2.getText().isEmpty()) {
                        dLabel.setText("Number 1 or Number 2 cannot be empty!");
                        d.setVisible(true);
                    } else {
                        int n1 = Integer.parseInt(field1.getText());
                        int n2 = Integer.parseInt(field2.getText());
                        if(n2 == 0)
                            throw new ArithmeticException("Division by zero");
                        
                        result.setText("" + (n1/n2));
                    }
                } catch (NumberFormatException formatE) {
                    dLabel.setText("Number Format Exception");
                    d.setVisible(true);
                } catch (ArithmeticException arithE) {
                    dLabel.setText("Division by zero not possible");
                    d.setVisible(true);
                }
            }
        });
        
        d = new Dialog(this, "Error", true);
        GridLayout gl = new GridLayout(2, 0);
        gl.setHgap(100);
        d.setLayout(gl);
        d.setSize(300, 150);
        dLabel = new Label("");
        d.add(dLabel);
        dBtn = new Button("Close");
        d.add(dBtn);
        dBtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                d.setVisible(false);
            }
        });
        d.addWindowListener(new WindowAdapter(){  
            public void windowClosing(WindowEvent e) {  
                d.setVisible(false);  
            }  
        });
    }
    
    public static void main(String[] args) {
        new UIDivision();
    }
}
