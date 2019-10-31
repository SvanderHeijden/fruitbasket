/**
 * This class helps with the budgeting of a fruit basket
 * @author 532033sh Sjoerd van der Heijden
 */

public class FruitBasket {
	
	private int appleCount = 0;

	private int orangeCount = 0;
	
	private int applePrice;
	
	private int orangePrice;

	private int budget;
	
	
	/**
	 * This method initiates a fruit basket that accepts three integers:
	 * @param orangePrice records the price of oranges, 
	 * @param budget records to changing budget,
	 * @param applePrice records the price of apples. 
	 */
	
	public FruitBasket(int budget, int applePrice, int orangePrice) {
		this.budget = budget;
		
		this.applePrice = applePrice;
		
		this.orangePrice = orangePrice;
		
	}
	
	/** @return boolean that is true when a budget is sufficient and false
	 * when a budget is not sufficient to buy an apple. When the boolean is true
	 * the price of an apple is subtracted from the budget and the count is 
	 * increased by one. When it is false, no purchase is made. 
	 */
	
	public boolean buyApple() {
		
		boolean sufficientBudget = applePrice <= budget;
	
		if (sufficientBudget) {
			
			boolean myBoolean = true;
			
			budget = budget - applePrice;
			
			appleCount++;
			
			return myBoolean;
		}
		
		else {
			
			boolean myBoolean = false;
			
			return myBoolean;
		}
	}
	
	/** @return boolean that is true when a budget is sufficient and false
	 * when a budget is not sufficient to buy an orange. When the boolean is true
	 * the price of an orange is subtracted from the budget and the count is 
	 * increased by one. When it is false, no purchase is made.
	 */
	
	public boolean buyOrange() {

		boolean sufficientBudget = orangePrice <= budget;
		
		if (sufficientBudget) {
			
			boolean myBoolean = true;
			
			budget = budget - orangePrice;
			
			orangeCount++;
			
			return myBoolean ;
		}
		else {
			
			boolean myBoolean = false;

			return myBoolean;
		}
	}
	
	/** @return String that includes the budget, apple count
	 * and orange count.
	 */
	
	public String getStatus() {
		return "budget: " + budget + " apples: " + appleCount + " oranges: " + orangeCount;
	}
}
