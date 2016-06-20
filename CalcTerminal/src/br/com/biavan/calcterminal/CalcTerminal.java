package br.com.biavan.calcterminal;

import java.util.Scanner;

import br.com.biavan.calcterminal.utils.ParseExpression;

public class CalcTerminal {

	public static void main(String[] args) {

	    System.out.println("┌────────────────────┐");
	    System.out.println("│  ╔═══╗ Calculadora │▒");
	    System.out.println("│  ╚═╦═╝ Terminal    │▒");
	    System.out.println("╞═╤══╩══╤════════════╡▒");
	    System.out.println("│ ├──┬──┤            │▒");
	    System.out.println("│ └──┴──┘            │▒");
	    System.out.println("└────────────────────┘▒");
	    System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");

	    Scanner scanner = new Scanner(System.in);
	    
	    String parm = "";
	    StringBuffer sb = new StringBuffer();
	    do {
	    	parm = scanner.next();
	    	sb.append(parm);
	    	if (parm.contains("=")) {
	    		System.out.println(ParseExpression.perform(sb.toString()));
	    		sb = new StringBuffer();
	    	}
	    }while(!parm.contains("quit"));
	    
	    

	}

}
