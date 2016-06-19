package br.com.biavan.calcterminal;

public abstract class AbstractCalc implements Calculable {
	
	private Double value;
	private Double remainder;
	
	public AbstractCalc(Double value) {
		super();
		this.value = value;
	}
	
	public Double getValue() {
		return value;
	}
	
	public Double getRemainder() {
		return remainder;
	}

	@Override
	public Calculable add(Calculable num) {
		AbstractCalc val = (AbstractCalc) num;
		value = value + val.getValue(); 
		return this;
	}

	@Override
	public Calculable subtract(Calculable num) {
		AbstractCalc val = (AbstractCalc) num;
		value = value - val.getValue();
		return this;
	}

	@Override
	public Calculable multiplies(Calculable num) {
		AbstractCalc val = (AbstractCalc) num;
		value = value * val.getValue();
		return this;
	}

	@Override
	public Calculable divides(Calculable num) {
		AbstractCalc val = (AbstractCalc) num;
		value = value / val.getValue();
		remainder = value % val.getValue();
		return this;
	}

	@Override
	public String toString() {
		return value.toString();
	}
	
	

}
