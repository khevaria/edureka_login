import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginFrame extends JFrame implements ActionListener {
	Container c = getContentPane();
	JLabel userLabel =new JLabel("USERNAME");
	JLabel passwordLabel =new JLabel("PASSWORD");
	JTextField userTextField = new JTextField();
	JPasswordField passwordField = new JPasswordField();
	JButton loginButton = new JButton("Login");
	JButton resetButton = new JButton("Reset");
	JCheckBox showPassword = new JCheckBox("Show Password");
	
	LoginFrame()
	{
		setLayoutManager();
		setLocationAndSize();
		addComponentsToContainer();
		addActionEvent();
	}
	public void setLayoutManager()
	{
		c.setLayout(null);
	}
	public void setLocationAndSize()
	{
		   userLabel.setBounds(50,150,100,30);
	       passwordLabel.setBounds(50,220,100,30);
	       userTextField.setBounds(150,150,150,30);
	       passwordField.setBounds(150,220,150,30);
	       showPassword.setBounds(150,250,150,30);
	       loginButton.setBounds(50,300,100,30);
	       resetButton.setBounds(200,300,100,30);
	}
	public void addComponentsToContainer()
	{
		c.add(userLabel);
		c.add(passwordLabel);
		c.add(userTextField);
		c.add(passwordField);
		c.add(showPassword);
		c.add(loginButton);
		c.add(resetButton);
	}
	
	public void addActionEvent() 
	{
		loginButton.addActionListener(this);
		resetButton.addActionListener(this);
		showPassword.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==loginButton)
		{
			String userText;
			String passwordText;
			userText = userTextField.getText();
			passwordText = passwordField.getText();
			if(userText.equalsIgnoreCase("Rishabh") && passwordText.equalsIgnoreCase("12345678"))
			{
				JOptionPane.showMessageDialog(this,"Login Successful");
			}
			else
			{
				JOptionPane.showMessageDialog(this, "Invalid Username or Password");
			}
		}
		
		if(e.getSource()==resetButton)
		{
			userTextField.setText("");
			passwordField.setText("");
		}
		
		if(e.getSource()==showPassword)
		{
			if(showPassword.isSelected())
			{
				passwordField.setEchoChar((char)0);
			}
			else
			{
				passwordField.setEchoChar('*');
			}
		}
		
	}
}
