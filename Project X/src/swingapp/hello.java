package swingapp;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.event.*;


public class hello implements ActionListener {
    JFrame frame;
    JLabel num1,num2, resultLabel;
    JTextField numText1,numText2,resultText2;
    JButton btn1;

    public hello(){
       frame=new JFrame("Calculator");


       num1=new JLabel("Number 1");
        num1.setBounds(50,50,100,20);

       num2=new JLabel("Number 2");
       num2.setBounds(50,100,100,20);

       resultLabel=new JLabel("Result");
       resultLabel.setBounds(50,150,100,20);

       numText1=new JTextField();
        numText1.setBounds(150,50,100,20);

        numText2=new JTextField();
        numText2.setBounds(150,100,100,20);

        resultText2=new JTextField();
        resultText2.setBounds(150,150,100,20);

        btn1=new JButton("Divide");
        btn1.setBounds(150,200,100,50);
        btn1.addActionListener(this);

      frame.add(num1);
      frame.add(num2);
      frame.add(resultLabel);
      frame.add(numText1);
      frame.add(numText2);
      frame.add(resultText2);
      frame.add(btn1);

       frame.setSize(600,600);
        
       frame.setLocationRelativeTo(null);

       frame.setLayout(null);

       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       frame.setVisible(true);

    }

  public static void main(String[] args) {
      new hello();
  }

  @Override
  public void actionPerformed(ActionEvent e) {

    Float num1 =Float.parseFloat(numText1.getText());

    int num2 =Integer.parseInt(numText2.getText());

    System.out.println(num1 +" "+num2);

   
    
        float resultNum=num1/num2;
        // System.out.println(resultNum);

        String result1=Float.toString(resultNum);
        
        resultText2.setText(result1);
  
    
  }

}
