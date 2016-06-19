package br.com.biavan.calcterminal;

import java.util.Scanner;

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
	    }while(!parm.contains("="));
	    
	    System.out.println(sb.toString());

	}

}
