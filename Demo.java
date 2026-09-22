import javax.swing.*;
import java.awt.*;
class Demo{
	public static void main(String[] args) {
		JFrame f1=new JFrame();
		f1.setSize(300,300);
		f1.setTitle("Calculator");
		f1.setLocationRelativeTo(null);
		f1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JButton btnSouth=new JButton("South");
		btnSouth.setFont(new Font("",Font.BOLD,25));
		f1.add("South",btnSouth);
		
		JButton btnNorth=new JButton("North");
		btnNorth.setFont(new Font("",Font.BOLD,25));
		f1.add("North",btnNorth);
		
		JButton btnWest=new JButton("West");
		btnWest.setFont(new Font("",Font.BOLD,25));
		f1.add("West",btnWest);
		
		JButton btnEast=new JButton("East");
		btnEast.setFont(new Font("",Font.BOLD,25));
		f1.add("East",btnEast);
		
		JButton btnCenter=new JButton("Center");
		btnCenter.setFont(new Font("",Font.BOLD,25));
		f1.add("Center",btnCenter);
		f1.setVisible(true);
	}
}
