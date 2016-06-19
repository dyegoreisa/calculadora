package br.com.biavan.calcterminal;

public class CalcTerminal {

	public static void main(String[] args) {

		Number num1 = new Number(Double.valueOf(15));
		Number num2 = new Number(Double.valueOf(32.8));
		Number num3 = new Number(Double.valueOf(6));
		Number num4 = new Number(Double.valueOf(24));
		Number num5 = new Number(Double.valueOf(4));
		
		
		System.out.println(num1.add(num3));

	}

}
