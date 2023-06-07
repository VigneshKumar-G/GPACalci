import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Calc implements ActionListener
{
    JFrame f;
    JPanel p;
    JTextField t;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdiv,bmul,bsub,badd,bdec,beq,bclr,br,bl,bsin,bcos,bsq,bsqrt;
    static double a=0,b=0,res=0;
    static int operator=0;
    Calc()
    {
        f=new JFrame("CALCULATOR");
        p=new JPanel();
        t=new JTextField();
        b1=new JButton("1");
        b2=new JButton("2");
        b3=new JButton("3");
        b4=new JButton("4");
        b5=new JButton("5");
        b6=new JButton("6");
        b7=new JButton("7");
        b8=new JButton("8");
        b9=new JButton("9");
        b0=new JButton("0");
        br=new JButton(")");
        bl=new JButton("(");
        bdiv=new JButton("/");
        bmul=new JButton("*");
        bsub=new JButton("-");
        badd=new JButton("+");
        bdec=new JButton(".");
        beq=new JButton("=");
        bclr=new JButton("clr");
        bsin=new JButton("sin");
        bcos=new JButton("cos");
        bsq=new JButton("^2");
        bsqrt=new JButton("sqrt");
        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(bmul);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(bdiv);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(badd);
        p.add(b0);
        p.add(bdec);
        p.add(beq);
        p.add(bsub);
        p.add(bsin);
        p.add(bcos);
        p.add(bsq);
        p.add(bsqrt);
        p.add(bl);
        p.add(br);
        p.add(bclr);
        p.setLayout(new GridLayout(6,4));
        f.add(p);
        f.add(t,BorderLayout.NORTH);
        f.setVisible(true);
        f.setSize(300,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        badd.addActionListener(this);
        bdec.addActionListener(this);
        beq.addActionListener(this);
        bclr.addActionListener(this);
        br.addActionListener(this);
        bl.addActionListener(this);
        bmul.addActionListener(this);
        bdiv.addActionListener(this);
        bsub.addActionListener(this);
        bsin.addActionListener(this);
        bcos.addActionListener(this);
        bsq.addActionListener(this);
        bsqrt.addActionListener(this);
       
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
            t.setText(t.getText().concat("1"));
        if(e.getSource()==b2)
            t.setText(t.getText().concat("2"));
        if(e.getSource()==b3)
            t.setText(t.getText().concat("3"));
        if(e.getSource()==b4)
            t.setText(t.getText().concat("4"));
        if(e.getSource()==b5)
            t.setText(t.getText().concat("5"));
        if(e.getSource()==b6)
            t.setText(t.getText().concat("6"));
        if(e.getSource()==b7)
            t.setText(t.getText().concat("7"));
        if(e.getSource()==b8)
            t.setText(t.getText().concat("8"));
        if(e.getSource()==b9)
            t.setText(t.getText().concat("9"));
        if(e.getSource()==b0)
            t.setText(t.getText().concat("0"));
        if(e.getSource()==bdec)
            t.setText(t.getText().concat("."));
        if(e.getSource()==br)
            t.setText(t.getText().concat(")"));
        if(e.getSource()==bl)
            t.setText(t.getText().concat("("));
        if(e.getSource()==badd)
        {
            a=Double.parseDouble(t.getText());
            operator=1;
            t.setText(" ");
        }
        if(e.getSource()==bsub)
        {
            a=Double.parseDouble(t.getText());
            operator=2;
            t.setText(" ");
        }
        if(e.getSource()==bmul)
        {
            a=Double.parseDouble(t.getText());
            operator=3;
            t.setText(" ");
        }
        if(e.getSource()==bdiv)
        {
            a=Double.parseDouble(t.getText());
            operator=4;
            t.setText(" ");
        }
        if(e.getSource()==bsin)
        {
            a=Double.parseDouble(t.getText());
            operator=5;
            t.setText(" ");
        }
        if(e.getSource()==bcos)
        {
            a=Double.parseDouble(t.getText());
            operator=6;
            t.setText(" ");
        }
        if(e.getSource()==bsq)
        {
            a=Double.parseDouble(t.getText());
            operator=7;
            t.setText(" ");
        }
        if(e.getSource()==bsqrt)
        {
            a=Double.parseDouble(t.getText());
            operator=8;
            t.setText(" ");
        }
        if(e.getSource()==beq)
        {
            switch(operator)
            {
                case 1:
                    b=Double.parseDouble(t.getText());
                    res=a+b;
                    break;
                case 2:
                    b=Double.parseDouble(t.getText());
                    res=a-b;
                    break;
                case 3:
                    b=Double.parseDouble(t.getText());
                    res=a*b;
                    break;
                case 4:
                    b=Double.parseDouble(t.getText());
                    res=a/b;
                    break;
                case 5: res=(Math.sin(a));
                    break;
                case 6: res=(Math.cos(a));
                    break;
                case 7: res=(Math.pow(a, 2));
                    break;
                case 8: res=(Math.sqrt(a));
                    break;
                default: res=0;        
            }
            t.setText(" "+res);
        }
        if(e.getSource()==bclr)
            t.setText(" ");
    }
    public static void main(String[] args)
    {
        Calc frame = new Calc();
    }
}
