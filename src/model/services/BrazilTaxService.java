package model.services;

public class BrazilTaxService {
	
	public Double tax(Double amount) {
		double basicAmount = 0;
		
		if (amount <= 100.0) {
			basicAmount += amount * 0.2;
		}
		else {
			basicAmount += amount * 0.15;
		}
		return basicAmount;
	}

}
