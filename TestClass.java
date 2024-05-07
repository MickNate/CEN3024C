package cop2805;

public class TestClass {

	public static void main(String[] args) {
		
		
		double salesAmount = 1000.00;
		double income = 0.00;
		System.out.println("Sales            Income");
		while(salesAmount <= 20000) //will loop until salesAmount is over $20000;
		{
			income = computeIncome(salesAmount); //returns the pay of the employee
			System.out.println("$" + salesAmount + "          " + "$" + income);
			salesAmount += 1000.00;
		}
	}
	
	public static double computeIncome(double salesAmount) {
		double total = 0;
		if(salesAmount <= 5000) //if less than or equal to $5000, simple calculation
			total = 5000 + (salesAmount * .08);
		else //if over $5000, sets it through other statements to calculate each part
		{
			total = 5000 + (5000.00 * .08);
			if(salesAmount <= 10000)
				total += ((salesAmount - 5000) *.1);
			else {
				total += (5000.00 * .10);
				total += ((salesAmount - 10000) *.12);
			}
		}
		return total;
		
	}

}
