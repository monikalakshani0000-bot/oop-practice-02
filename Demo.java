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
		
		JButton btn1=new JButton("1");
		btn1.setFont(new Font("",Font.BOLD,25));
		JButton btn2=new JButton("2");
		btn2.setFont(new Font("",Font.BOLD,25));
		JButton btn3=new JButton("3");
		btn3.setFont(new Font("",Font.BOLD,25));
		JButton btn4=new JButton("4");
		btn4.setFont(new Font("",Font.BOLD,25));
		
		JPanel centerPanel=new JPanel();
		centerPanel.setLayout(new GridLayout(2,2));
		centerPanel.add(btn1);
		centerPanel.add(btn2);
		centerPanel.add(btn3);
		centerPanel.add(btn4);
		
		f1.add("Center",centerPanel);
		f1.setVisible(true);
	}
}
