package br.com.biavan.calcterminal;

import java.util.Scanner;

public class CalcTerminal {

	public static void main(String[] args) {

	    Scanner scanner = new Scanner(System.in);

	    System.out.println("--<<< < < < [ Calculadora ] > > > >>>--");
	    
	    String parm = "";
	    StringBuffer sb = new StringBuffer();
	    do {
	    	parm = scanner.next();
	    	sb.append(parm);
	    }while(!parm.contains("="));
	    
	    System.out.println(sb.toString());

	}

}
