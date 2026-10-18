package Area;
import java.util.Scanner;

public class Square extends Shape {
	int side;
	
	@Override
	public void takeInput() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the side of square: ");
		side = sc.nextInt();
		
		sc.close();
	}
	 
	@Override
	public void calculateArea() {
		area = side * side;
	}
}
