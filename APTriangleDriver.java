

public class APTriangleDriver {

	public static void main(String[] args) {
		APTriangle tril = new APTriangle(3, 4, 5);
		int perimeter = tril.getPerimeter();
		String isright = tril.isRight();
		System.out.println(perimeter+isright);
		SOP(isright);

	}
	
	public static void SOP(String s) {
		 System.out.println(s);
	}

}
