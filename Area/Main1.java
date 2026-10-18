package Area;

public class Main1 {

	public static void main(String[] args) {

		qwerty(new Circle());

		qwerty(new Rectangle());

		qwerty(new Square());
		
	}
	
	static void qwerty(Shape sh) {
		sh.takeInput();
		sh.calculateArea();
		sh.displayArea();
	}

}
