
import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
  
class GPA  ()
{ 
    JLabel l; 
    JTextField t; 
    JButton b; 
  
     GPA(); 
	{ 
        JFrame f = new JFrame(); 
  
        l = new JLabel("Enter Number"); 
        l.setBounds(50, 100, 100, 30); 
  
        t = new JTextField(); 
        t.setBounds(150, 100, 200, 30); 
  
        b = new JButton("Find GPA"); 
        b.setBounds(100, 200, 100, 30); 
        b.addActionListener(this); 
  
        f.add(l); 
        f.add(t); 
        f.add(b); 
  
        f.setSize(400, 400); 
        f.setLayout(null); 
        f.setVisible(true); 
    } 
  
    public void actionPerformed(ActionEvent e) 
	{ 
        String s1 = t.getText(); 
        float num = Float.parseFloat(s1); 
        float GPA = (float) (num / 20.0); 
  
        JOptionPane.showMessageDialog(null, "Your GPA is: " + GPA); 
    } 
  
    public static void main(String[] args) 
	{ 
        new GPA(); 
    } 
}