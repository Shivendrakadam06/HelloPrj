package com.day3;

public class CalculatorSimulator {
	public static void main(String[] args) throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException {
		TaxCalculator tx =new TaxCalculator();
		
		try {
		tx.calculateTax();
		}
		catch(CountryNotValidException con) {
			System.out.println(con.getMessage());
		}
		catch(EmployeeNameInvalidException en) {
			System.out.println(en.getMessage());
		}
		catch(TaxNotEligibleException te) {
			System.out.println(te.getMessage());
		}
	}
	

}
