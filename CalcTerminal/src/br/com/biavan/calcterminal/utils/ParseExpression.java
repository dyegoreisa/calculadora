package br.com.biavan.calcterminal.utils;

import br.com.biavan.calcterminal.Num;

public final class ParseExpression {

	public static Num perform(String expression) {
		String[] parts = expression.split("=");
		String[] values = {};
		String[] operations = {};
		try {
			values = parts[0].split("[\\+|\\-|\\*|/|\\(|\\)]+");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Deve ser informada uma expressão!");
			return new Num(0);
		}
		try{
			operations = parts[0].split("[\\d|\\.|\\(|\\)]+");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Devem ser informados números!");
			return new Num(0);
		}

		Num num = new Num(0);
		for (int i = 0; i < values.length; i++) {

			String value = values[i];
			String operator = operations[i];

			if(i == 0) {
				num.add(new Num(value));
			} else {
				switch(operator) {
				case "+":
					num.add(new Num(values[i]));
					break;
				case "-":
					num.subtract(new Num(values[i]));
					break;
				case "*":
					num.multiplies(new Num(values[i]));
					break;
				case "/":
					num.divides(new Num(values[i]));
					break;
				}
			}
		}

		return num;
	}



}
