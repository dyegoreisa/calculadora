package br.com.biavan.calcterminal;

public abstract class AbstractCalc implements Calculable {
	
	private Double value;
	private Double remainder;
	
	public AbstractCalc(Double value) {
		super();
		this.value = value;
	}

	public AbstractCalc(Integer value) {
		super();
		this.value = Double.valueOf(value);
	}

	public AbstractCalc(Float value) {
		super();
		this.value = Double.valueOf(value);
	}

	public AbstractCalc(Long value) {
		super();
		this.value = Double.valueOf(value);
	}

	public AbstractCalc(String value) {
		super();
		this.value = Double.valueOf(value);
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
		remainder = value % val.getValue();
		value = value / val.getValue();
		return this;
	}

	@Override
	public String toString() {
		return value.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((remainder == null) ? 0 : remainder.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AbstractCalc other = (AbstractCalc) obj;
		if (remainder == null) {
			if (other.remainder != null)
				return false;
		} else if (!remainder.equals(other.remainder))
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}

}
