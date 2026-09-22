import javax.swing.*;
import java.awt.*;
class Demo{
	public static void main(String[] args) {
		JFrame f1=new JFrame();
		f1.setSize(300,300);
		f1.setTitle("Calculator");
		f1.setLocationRelativeTo(null);
		f1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JLabel lblTitle=new JLabel("Add Student Form");
		lblTitle.setFont(new Font("",1,28));
		lblTitle.setHorizontalAlignment(JLabel.CENTER);
		f1.add("North",lblTitle);
		
		JTextField txtId=new JTextField(5);
		txtId.setFont(new Font("",1,20));
		JTextField txtName=new JTextField(10);
		txtName.setFont(new Font("",1,20));
		JTextField txtPrfMarks=new JTextField(3);
		txtPrfMarks.setFont(new Font("",1,20));
		JTextField txtDbmsMarks=new JTextField(3);
		txtDbmsMarks.setFont(new Font("",1,20));
		
		JLabel lblId=new JLabel("Student ID");	
		lblId.setFont(new Font("",1,20));
		JLabel lblName=new JLabel("Name");	
		lblName.setFont(new Font("",1,20));
		JLabel lblPrfMarks=new JLabel("PRF Marks");	
		lblPrfMarks.setFont(new Font("",1,20));
		JLabel lblDbmsMarks=new JLabel("DBMS Marks");	
		lblDbmsMarks.setFont(new Font("",1,20));
		
		JPanel panel=new JPanel(new GridLayout(4,2));	
		panel.add(lblId);
		panel.add(txtId);
		panel.add(lblName);	
		panel.add(txtName);	
		panel.add(lblPrfMarks);	
		panel.add(txtPrfMarks);	
		panel.add(lblDbmsMarks);
		panel.add(txtDbmsMarks);
		f1.add("West",panel);
		f1.pack();
		f1.setVisible(true);
	}
}
