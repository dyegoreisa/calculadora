package br.com.biavan.calcterminal;

public interface Calculable {
	
	public Calculable add(Calculable num);
	
	public Calculable subtract(Calculable num);
	
	public Calculable multiplies(Calculable num);
	
	public Calculable divides(Calculable num);
}
