import java.util.Iterator;


public class Pascal {

	public static void main(String[] args) {
		
		
		
		for(int i=0;i<=10;i++) {
			for (int j=0;j<=10-i;j++) {
				System.out.printf("%2s","");
			}
			for(int j=0;j<=i;j++){
				System.out.printf("%4s",pascal(i,j));
					//System.out.printf("(%d %d)", i,j);
				
			}
			System.out.println();
		}
		//for(int n=0;n<=10;n++) {
	//		for(int k=0;k<=10;k++) {
		//		System.out.printf("(%d %d)", n,k);
			//System.out.printf("%4s",pascal(n,k));
				//pascal(n,k); 
		//	}
		//	System.out.println();
		//}

	}
	
	public static int pascal(int n, int k) {
		
		int n_fact = 1;
		for(int i=1;i<=n;i++){
			n_fact*=i;
		}
		
		int k_fact = 1;
		for(int i=1;i<=k;i++) {
			k_fact *=i;
		}
		
		int nmink_fact = 1;
		for(int i=1;i<=(n-k);i++) {
			nmink_fact *=i;
		}
		
		int bottom = ((k_fact)*(nmink_fact));
		if (bottom==0) bottom=1;
		int pascal = n_fact/bottom;
		
		return pascal;
	}
	

}
