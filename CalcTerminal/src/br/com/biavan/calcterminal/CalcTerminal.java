package br.com.biavan.calcterminal;

public class CalcTerminal {

	public static void main(String[] args) {

		Num num1 = new Num(Double.valueOf(15));
		Num num2 = new Num(Double.valueOf(32.8));
		Num num3 = new Num(Double.valueOf(6));
		Num num4 = new Num(Double.valueOf(24));
		Num num5 = new Num(Double.valueOf(4));
		Num num6 = new Num(Double.valueOf(3));
		
		
		System.out.println(num1.add(num3));
		System.out.println(num4.subtract(num3));
		System.out.println(num3.multiplies(num5));
		
		System.out.print(num6.divides(num3));
		System.out.println(" Resta: " + num6.getRemainder());
		
		System.out.print(num2.divides(num3));
		System.out.println(" Resta: " + num2.getRemainder());
		
		System.out.print(num3.divides(num6));
		System.out.println(" Resta: " + num3.getRemainder());

	}

}
