import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;


public class LeCalc extends JFrame{
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
   

    public LeCalc(){
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(5,3));
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
        equalBut.addActionListener(new Equal());
        subBut.addActionListener(new Sub());
       
        j.setText(display); 
        calc = new Calculator();
    }

    class One implements ActionListener {
        public void actionPerformed(ActionEvent e){
            display = j.getText();
            j.setText(display + "1");
            display = j.getText();
           
        }
    }

    class Add implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = j.getText(); 
            
            if(display.charAt(display.length()-2) == '+'){
          
            }
            else if(display.charAt(display.length()-2) == '-'){
            
            }
            else if (display.charAt(display.length() - 2) == '/') {

            }
            else if (display.charAt(display.length() - 2) == '*') {
                
            }else{
                display = j.getText();
                if (display.charAt(display.length() - 1) != ' ') {
                    display = j.getText();
                    j.setText(display + " + ");
                    display = j.getText();
                    add = true;
                }else{
                    display = j.getText();
                    j.setText(display + "+ ");
                    display = j.getText();
                    add = true;
                }
                
            }
    }
    }



    class Sub implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = j.getText(); 
            
            if(display.charAt(display.length()-2) == '+'){
               display = display.substring(0,display.length()-2) + '-'+display.substring(display.length()-2);
                
            }
            else if(display.charAt(display.length()-2) == '-'){
                display = display.substring(0, display.length() - 2) + "+ ";
            }
            else if (display.charAt(display.length() - 2) == '/') {

            }
            else if (display.charAt(display.length() - 2) == '*') {
                
            }else{
                sub = true;
                display = j.getText();
                if (display.charAt(display.length() - 1) != ' ') {
                    display = j.getText();
                    j.setText(display + " - ");
                    display = j.getText();
                    add = true;
                }else{
                    display = j.getText();
                    j.setText(display + "- ");
                    display = j.getText();
                    add = true;
                }
                
            }
           
            
          
            
        
    }}

    class Equal implements ActionListener {
        public void actionPerformed(ActionEvent e) {
             display = j.getText();
            if(display.charAt(display.length()-1) != ' '){
                j.setText(display + " ");
                display = j.getText();
            }
           
            
            if(mul == true){
                for(int i = 0; i < display.length(); i++) {
                    if(display.charAt(i) == '*') {
                        int position1 = i-1;
                        int position2 = i-1;    
                        for(int j = i-2; !(display.charAt(j) == ' '); j--) {
                            position2--;
                        }
                        double num1 = Double.parseDouble(display.substring(position2, position1));
                        int position3 = i+2;
                        int position4 = i+2;  
                        System.out.println(display);  
                        for(int j = i+2;!(display.charAt(j) == ' '); j++) {
                            position3++;
                        }
                        double num2 = Double.parseDouble(display.substring(position4, position3));
                        double d = calc.multiply(num1, num2);
                
                        display =  display.substring(0, position2) + d + display.substring(position3);

                        i=0;
                    }
                }
            }

            if(div == true){
                for(int i = 0; i < display.length(); i++) {
                    if(display.charAt(i) == '/') {
                        int position1 = i-1;
                        int position2 = i-1;    
                        for(int j = i-2; !(display.charAt(j) == ' '); j--) {
                            position2--;
                        }
                        double num1 = Double.parseDouble(display.substring(position2, position1));
                        int position3 = i+2;
                        int position4 = i+2;  
                        System.out.println(display);  
                        for(int j = i+2;!(display.charAt(j) == ' '); j++) {
                            position3++;
                        }
                        double num2 = Double.parseDouble(display.substring(position4, position3));
                        double d = calc.divide(num1, num2);
                
                        display =  display.substring(0, position2) + d + display.substring(position3);

                        i=0;
                    }
                }
            }
            
            if(add == true){
                for(int i = 0; i < display.length(); i++) {
                    if(display.charAt(i) == '+') {
                        int position1 = i-1;
                        int position2 = i-1;    
                        for(int j = i-2; !(display.charAt(j) == ' '); j--) {
                            position2--;
                        }
                        double num1 = Double.parseDouble(display.substring(position2, position1));
                        int position3 = i+2;
                        int position4 = i+2;  
                        System.out.println(display);  
                        for(int j = i+2;!(display.charAt(j) == ' '); j++) {
                            position3++;
                        }
                        double num2 = Double.parseDouble(display.substring(position4, position3));
                        double d = calc.add(num1, num2);
                
                        display =  display.substring(0, position2) + d + display.substring(position3);

                        i=0;
                    }
                }
            }

            if(sub == true){
                for(int i = 0; i < display.length(); i++) {
                    if(display.charAt(i) == '-') {
                        int position1 = i-1;
                        int position2 = i-1;    
                        for(int j = i-2; !(display.charAt(j) == ' '); j--) {
                            position2--;
                        }
                        double num1 = Double.parseDouble(display.substring(position2, position1));
                        int position3 = i+2;
                        int position4 = i+2;  
                        System.out.println(display);  
                        for(int j = i+2;!(display.charAt(j) == ' '); j++) {
                            position3++;
                        }
                        double num2 = Double.parseDouble(display.substring(position4, position3));
                        double d = calc.subtract(num1, num2);
                
                        display =  display.substring(0, position2) + d + display.substring(position3);

                        i=0;
                    }
                }
            }
           
            j.setText((display));
            add = false;
            sub = false;
            mul = false;
            div = false;
        }}
    




    






    public static void main(String[] args){
        LeCalc calc = new LeCalc();
        calc.pack();
        calc.setLocationRelativeTo(null);
        calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calc.setVisible(true);

    }

    }
