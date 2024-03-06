package entities;

public class Individual extends TaxPayer {
	private Double healthSpending;

	public Individual() {
		super();
	}
	
	public Individual(String name, Double income, Double healthSpending) {
		super(name, income);
		this.healthSpending = healthSpending;
	}

	public Double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(Double healthSpending) {
		this.healthSpending = healthSpending;
	}

	@Override
	public Double totalTax() {
		Double tax;
		
		if (income < 20000) 
			tax = 0.15 * income;
		else 
			tax = 0.25 * income;
		
		if (healthSpending > 0.0)
			tax -= healthSpending * 0.5;
		
		return tax;
	}
}
