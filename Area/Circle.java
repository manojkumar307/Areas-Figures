package Area;
import java.util.Scanner;


public class Circle extends Shape {
	int radius;
	
	@Override
	public void takeInput() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius: ");
		radius = sc.nextInt();
		
		
	}
	 
	@Override
	public void calculateArea() {
		area = (int) (Math.PI * radius * radius);
	}
}
