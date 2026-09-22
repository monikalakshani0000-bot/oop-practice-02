import javax.swing.*;
import java.awt.*;
class Calculator extends JFrame{
	
	private JTextField txtDisplay;
	private JButton[] buttonArray;
	
	
	
	Calculator(){
		setTitle("Calculator");
		setSize(300,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		txtDisplay=new JTextField(5);
		txtDisplay.setFont(new Font("",1,20));
		add("North",txtDisplay);
		
		buttonArray=new JButton[16];
		String[] buttonName={"7","8","9","*","4","5","6","/","1","2","3","+","0",".","=","-"};

		for (int i = 0; i < 16; i++){
			buttonArray[i]=new JButton(buttonName[i]);
			buttonArray[i].setFont(new Font("",Font.BOLD,25));
			add(buttonArray[i]);
		}

		
	}
}

class Demo{
	public static void main(String[] args) {
		Calculator c1=new Calculator();
		c1.setVisible(true);
	}
}
