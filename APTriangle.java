

public class APTriangle {
	int a,b,c;

	public APTriangle(int a,int b, int c) {
		setA(a);
		setB(b);
		setC(c);
	}
	
	public int getPerimeter() {
		return a + b + c;
	}
	public String isRight(){
		
	return (c==Math.sqrt(Math.pow(a,2)+Math.pow(b, 2))) ? "yes" : "no";
		
	}
	public int getA() {
		return a;
	}

	public void setA(int a) {
	if(a>0)	this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		if(a>0) this.b = b;
	}

	public int getC() {
		return c;
	}
	public void SOP(String s) {
		System.out.println(s);
	}
	public void setC(int c) {
		if(a>0) this.c = c;
	}

}
