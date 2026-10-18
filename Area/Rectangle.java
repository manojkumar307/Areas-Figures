package Area;
import java.util.Scanner;


public class Rectangle extends Shape {
	
	int length;
	int breadth;
	
	@Override
	public void takeInput() {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Length: "); 
	length = sc.nextInt();
	
	System.out.print("And Breadth: ");
	breadth = sc.nextInt();
	
	
	} 
	
	@Override
	public void calculateArea() {
		area = length * breadth;
	}
}
