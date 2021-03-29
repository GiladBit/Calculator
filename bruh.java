import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class bruh extends JFrame {
    private JButton addBut;
    private JButton subBut;
    private JButton mulBut;
    private JButton divBut;
    private JButton But1;
    private JButton But2;
    private JButton But3;
    private JButton But4;
    private JButton But5;
    private JButton But6;
    private JButton But7;
    private JButton But8;
    private JButton But9;
    private JButton But0;
    private JButton ButC;
    private JButton equalBut;
    private JTextField j;
    private Calculator calc;
    private double temp;
    private double Solvetemp;

    Boolean add = false;
    Boolean sub = false; 
    Boolean mul = false;
    Boolean div = false;

    String display = " ";

    public bruh() {
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(5, 3));
        p1.add(But0 = new JButton("0"));
        p1.add(But1 = new JButton("1"));
        p1.add(But2 = new JButton("2"));
        p1.add(But3 = new JButton("3"));
        p1.add(But4 = new JButton("4"));
        p1.add(But5 = new JButton("5"));
        p1.add(But6 = new JButton("6"));
        p1.add(But7 = new JButton("7"));
        p1.add(But8 = new JButton("8"));
        p1.add(But9 = new JButton("9"));

        JPanel p2 = new JPanel();
        p2.setLayout(new FlowLayout());
        p2.add(j = new JTextField(20));
        j.setHorizontalAlignment(JTextField.RIGHT);
        j.setEditable(false);

        JPanel p3 = new JPanel();
        p3.setLayout(new GridLayout(5, 1));
        p3.add(addBut = new JButton("+"));
        p3.add(subBut = new JButton("-"));
        p3.add(mulBut = new JButton("*"));
        p3.add(divBut = new JButton("/"));
        p3.add(equalBut = new JButton("="));

        JPanel p = new JPanel();
        p.setLayout(new GridLayout());
        p.add(p2, BorderLayout.NORTH);
        p.add(p1, BorderLayout.SOUTH);
        p.add(p3, BorderLayout.EAST);

        add(p);

        But1.addActionListener(new One());
       
        addBut.addActionListener(new Add());
        equalBut.addActionListener(new Equals());
      

        j.setText(display);
        calc = new Calculator();
    } 

    class One implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = j.getText();
            j.setText(display + "1");
            display = j.getText();
          

        }
    }
    
    class Add implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = j.getText();
            j.setText(display + "+");
            display = j.getText();

        }
    }
    
    class Equals implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = j.getText();
            temp = Double.parseDouble(j.getText());
            String a = String.valueOf(temp);
        
            j.setText(a);
            

        }
    }

 

    public static void main(String[] args) {
        bruh calc = new bruh();
        calc.pack();
        calc.setLocationRelativeTo(null);
        calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calc.setVisible(true);

    }

}
