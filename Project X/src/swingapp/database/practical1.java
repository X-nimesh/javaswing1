package swingapp.database;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class practical1 implements ActionListener, WindowListener, MouseListener{
    JFrame  frame;
    JLabel firstNumber,secondNumber, resultLabel,NameLabel,emailLabel,usernameLabel,PasswordLabel,welcomeLabel,loginLabel;
    JTextField  result,firstField,secondField,welcomeField,usernameField;
    JPasswordField passwordField;
    JButton divide,signupButton,restButton;
    JPanel panel;

    public practical1(){
        frame = new JFrame("Sign Up Form");
        frame.addWindowListener(this);

        panel =new JPanel();
        panel.setLayout(null);
        
        panel.setBounds(70,70,410,420);
        // panel.setBorder(BorderFactory.createLoweredBevelBorder());
        // panel.setBorder(BorderFactory.createRaisedSoftBevelBorder());
        // panel.setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));
        // panel.setBorder(BorderFactory.createTitledBorder("User Login"));
        // panel.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createRaisedBevelBorder(),BorderFactory.createTitledBorder("User Login")));
        panel.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createRaisedBevelBorder(),BorderFactory.createLineBorder(Color.RED, 2)));

        // loginLabel =new JLabel("Already a User? Click Here :)");
        // loginLabel.setBounds(150,330,250,30);
        // loginLabel.addMouseListener(this);

        // loginLabel =new JLabel("Already a User? Click Here :)");
        // loginLabel.setBounds(150,330,250,30);
        // loginLabel.addMouseListener(this);
        
        welcomeLabel = new JLabel("Division");
        welcomeLabel.setBounds(100,30,300,40);
        welcomeLabel.setFont(new Font("Algerian", Font.PLAIN,50));


        // emailLabel = new JLabel("Email");
        // emailLabel.setBounds(50,100,100,25);

        firstNumber = new JLabel("Number 1:");
        firstNumber.setBounds(80,100,100,25);

        firstField= new JTextField("0");
        firstField.setBounds(180,100,150,25);

        secondNumber= new JLabel("Number 2:");
        secondNumber.setBounds(80,150,150,25);

        secondField= new JTextField("0");
        secondField.setBounds(180,150,150,25);

        resultLabel= new JLabel("Result:");
        resultLabel.setBounds(80,200,150,25);

        result= new JTextField();
        result.setBounds(180,200,150,25);

        divide= new JButton("Calculate");
        divide.setBounds(150,250,100,30);
        divide.addActionListener(this);

        // fullNameLabel= new JLabel("Full Name");
        // fullNameLabel.setBounds(50,150,150,25);

        // fullNameField= new JTextField();
        // fullNameField.setBounds(120,150,250,25);

        // usernameLabel=new JLabel("Username");
        // usernameLabel.setBounds(50,200,150,25);

        // usernameField=new JTextField();
        // usernameField.setBounds(120,200,250,25);
 
        // PasswordLabel=new JLabel("Password");
        // PasswordLabel.setBounds(50,250,150,25);

        // passwordField=new JPasswordField();
        // passwordField.setBounds(120,250,250,25);

        // loginLabel =new JLabel("Already a User? Click Here :)");
        // loginLabel.setBounds(120,350,250,30);
        // loginLabel.addMouseListener(this);



       
       
        
        panel.add(welcomeLabel);
        panel.add(result);
        panel.add(resultLabel);
        // panel.add(fullNameLabel);
        // panel.add(fullNameField);

        // panel.add(usernameLabel);
        panel.add(divide);

        panel.add(firstNumber);
        panel.add(firstField);

        panel.add(secondField);

        panel.add(secondNumber);

        frame.add(panel);

        frame.setSize(600,600);
        
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }


public static void main(String[] args) {
    new practical1();
}


@Override
public void actionPerformed(ActionEvent e) {
    // String username =usernameField.getText();
    // String fullName=fullNameField.getText();
    // String email=emailField.getText();
    // String password=passwordField.getText();
    Float num1 =Float.parseFloat(firstField.getText());
    int num2 =Integer.parseInt(secondField.getText());
    System.out.println(num1 +" "+num2);
    if(num1==0 || num2==0){
         JOptionPane.showMessageDialog(frame,"Please provide all the fields" ,"ncomplete detail",JOptionPane.ERROR_MESSAGE);
    }
    else{
        float resultNum=num1/num2;
        System.out.println(resultNum);
        String result1=Float.toString(resultNum);
        result.setText(result1);
    // //     if(new StudentDao().registerUser(fullName,email,username,password))
    // //     {   
            
    //         JOptionPane.showMessageDialog(frame,"New User registered successfully" ,"User Registered",JOptionPane.INFORMATION_MESSAGE);
    //         fullNameField.setText("");
    //         emailField.setText("");
    //         usernameField.setText("");
    //         passwordField.setText("");
    //         frame.dispose();
           

        }
    //     else{
    //         JOptionPane.showMessageDialog(frame,"New User not Registered" ,"Something went wrong",JOptionPane.ERROR_MESSAGE);
    //     }


    }
     
    
    
// }


@Override
public void windowOpened(WindowEvent e) {
     
    
}


@Override
public void windowClosing(WindowEvent e) {
    
    int option= JOptionPane.showOptionDialog(frame,"Are you sure you want to exit?"
    , "Exit", JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE, null,null,JOptionPane.YES_OPTION);
    
    if(option==0)
    {
        System.exit(0);
    }
    else
    {
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }
}


@Override
public void windowClosed(WindowEvent e) {
     
    
}


@Override
public void windowIconified(WindowEvent e) {
     
    
}


@Override
public void windowDeiconified(WindowEvent e) {
     
    
}


@Override
public void windowActivated(WindowEvent e) {
     
    
}


@Override
public void windowDeactivated(WindowEvent e) {
     
    
}


@Override
public void mouseClicked(MouseEvent e) {
    this.frame.dispose();
             
    
}


@Override
public void mousePressed(MouseEvent e) {
     
    
}


@Override
public void mouseReleased(MouseEvent e) {
     
    
}


@Override
public void mouseEntered(MouseEvent e) {
     
    
}


@Override
public void mouseExited(MouseEvent e) {
     
    
}

}

