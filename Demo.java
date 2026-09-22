import javax.swing.*;
import java.awt.*;
class Demo{
	public static void main(String[] args) {
		JFrame f1=new JFrame();
		f1.setSize(500,500);
		f1.setTitle("Calculator");
		f1.setLocationRelativeTo(null);
		f1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		f1.setLayout(new FlowLayout());
		f1.setLayout(new GridLayout(4,2,2,2));
		
		
		JLabel idL = new JLabel("ID");
		idL.setFont(new Font("",1,25));
		f1.add(idL);
		
		JTextField idT =new JTextField(5);
		idT.setFont(new Font("",1,20));
		f1.add(idT);
		
		JLabel nameL = new JLabel("Name");
		nameL.setFont(new Font("",1,25));
		f1.add(nameL);
		
		JTextField nameT=new JTextField(5);
		nameT.setFont(new Font("",1,20));
		f1.add(nameT);
		
		JLabel prfL = new JLabel("PrfMarks");
		prfL.setFont(new Font("",1,25));
		f1.add(prfL);
		
		JTextField prfT=new JTextField(5);
		prfT.setFont(new Font("",1,20));
		f1.add(prfT);
		
		JLabel DbmsL = new JLabel("DBMS Marks");
		DbmsL.setFont(new Font("",1,25));
		f1.add(DbmsL);
		
		JTextField DbmsT=new JTextField(5);
		DbmsT.setFont(new Font("",1,20));
		f1.add(DbmsT);
		
		f1.pack();
		f1.setVisible(true);
	}
}
