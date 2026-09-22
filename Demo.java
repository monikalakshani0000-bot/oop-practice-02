import javax.swing.*;
import java.awt.*;
class Demo{
	public static void main(String[] args) {
		JFrame f1=new JFrame();
		f1.setSize(1000,1000);
		f1.setTitle("Calculator");
		f1.setLocationRelativeTo(null);
		f1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		f1.setLayout(new BorderLayout());
		
		JButton btnNorth=new JButton("North");
		btnNorth.setFont(new Font("",Font.BOLD,25));
		f1.add(btnNorth, BorderLayout.NORTH);
		f1.add(btnNorth);
		
		JButton btnSouth=new JButton("South");
		btnSouth.setFont(new Font("",Font.BOLD,25));
		f1.add(btnNorth, BorderLayout.SOUTH);
		f1.add(btnSouth);
		
		JButton btnEast=new JButton("East");
		btnEast.setFont(new Font("",Font.BOLD,25));
		f1.add(btnNorth, BorderLayout.EAST);
		f1.add(btnEast);
		
		JButton btnWest=new JButton("West");
		btnWest.setFont(new Font("",Font.BOLD,25));
		f1.add(btnNorth, BorderLayout.WEST);
		f1.add(btnWest);
		
		/*JButton btnCenter=new JButton("CENTER");
		btnCenter.setFont(new Font("",Font.BOLD,25));
		f1.add(btnNorth, BorderLayout.NORTH);
		f1.add(btnCenter);*/
		
		f1.setVisible(true);
	}
}
