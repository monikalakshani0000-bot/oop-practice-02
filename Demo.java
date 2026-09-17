import java.util.*;
class Demo{
	public static void main(String args[]){

		Scanner input = new Scanner(System.in);

		int t =0 ;
		for(int i=0; i<50; i++){					
			System.out.print("Input Number : ");
			int num = input.nextInt();
			
			if(num>100){
				t++;
			}								
		}
		System.out.print("\nNumbers greater than 100: "+t);
		
		System.out.println("Monika");
		
	}
}
