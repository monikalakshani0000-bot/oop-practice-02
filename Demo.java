import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame{
	private JButton btnExit;
	
	MyFrame(){
		setSize(400,300);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		
		btnExit=new JButton("Exit");
		btnExit.setFont(new Font("",1,20));
		btnExit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				System.out.println("Exited....");
				System.exit(0);
			}
		});
		add(btnExit);
	}
}
class Demo{
	public static void main(String[] args) {
		new MyFrame().setVisible(true);
	}
}
