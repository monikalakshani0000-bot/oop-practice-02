import javax.swing.*;
import java.awt.*;
class Demo{
	public static void main(String[] args) {
		JFrame f1=new JFrame();
		f1.setSize(300,300);
		f1.setTitle("Calculator");
		f1.setLocationRelativeTo(null);
		f1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		f1.setLayout(new GridLayout(4,4,2,2));
		
		
		JButton[] buttonArray = new JButton[16];
		String[] buttonName = {"7","8","9","*","4","5","6","/","1","2","3","+","0",".","=","-"};
		
		for(int i = 0;i<16;i++){
			buttonArray[i] = new JButton(buttonName[i]);
			buttonArray[i].setFont(new Font("",Font.BOLD,25));
			f1.add(buttonArray[i]);
		}
	
	
		
		/*JButton[] buttonArray=new JButton[16];
		String[] buttonName={"7","8","9","*","4","5","6","/","1","2","3","+","0",".","=","-"};
		
		for (int i = 0; i < 16; i++){
			buttonArray[i]=new JButton(buttonName[i]);
			buttonArray[i].setFont(new Font("",Font.BOLD,25));
			f1.add(buttonArray[i]);
		}*/

		f1.setVisible(true);
	}
}
