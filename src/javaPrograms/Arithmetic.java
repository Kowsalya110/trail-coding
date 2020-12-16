package javaPrograms;

public class Arithmetic {
	
	public void add() {
		int a,b,c;
		a=10;
		b=20;
		c=a+b;
		System.out.println(c);

	}

	public void sub() {
		int a,b,c;
		a=10;
		b=20;
		c=a-b;
		System.out.println(c);

	}

	public void multi() {
		int a,b,c;
		a=10;
		b=20;
		c=a*b;
		System.out.println(c);

	}

	public void div() {
		int a,b,c;
		a=10;
		b=20;
		c=a/b;
		System.out.println(c);

	}

	public static void main(String[] args) {
		Arithmetic calc=new Arithmetic();
		calc.add();
		calc.sub();
		calc.multi();
		calc.div();



	}

}
