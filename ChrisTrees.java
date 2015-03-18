
public class ChrisTrees {

	public static void main(String[] args) {
		trees(4,3);

	}
	
	public static  void trees(int height,int seg) {
		
			for (int p = 1; p <= seg; p++) {
				for (int i = p; i <= height; i++) {
					for (int j = 1; j <= height - i; j++) {
						System.out.print(" ");
					}
					for (int j = 1; j <= 2 * i - 1; j++) {
						System.out.print("*");
					}

					System.out.println();
				}
			}
			for(int i=1;i<=2;i++){
				for(int j=1;j<=height-1;j++) {
					System.out.print(" ");
				}
				System.out.print("*");
				System.out.println();
				
			}
			for(int i=1;i<=height;i++) {
				System.out.print(" ");
			}
			
			for(int i=1;i<=(height)-2;i++) {
				System.out.print("*");
			}
			
		
	}

}
