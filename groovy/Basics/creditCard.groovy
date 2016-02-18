
/**
 * A simple model for a consumer credit card.
 * javadoc
 *
 * @author Michael T. Goodrich
 * @author Roberto Tamassia
 * @author Michael H. Goldwasser 
 */

public class CreditCard {
	/**
	  * Constructs a new credit card instance.
	  * instance variables: 
	  * @param cust
	  * @param bk
	  * @param acnt
	  * @param lim
	  * @param initialBal
	  */
	private String customer; 	// name of the customer (e.g., ”John Bowman”) 
	private String bank; 		// name of the bank (e.g., ”California Savings”)
	private String account; 	// account identifier (e.g., ”5391 0375 9387 5309”) 
	private int limit; 			// credit limit (measured in dollars)
	protected double balance; 	// current balance (measured in dollars)
	// Constructors:
	public CreditCard(String cust, String bk, String acnt, int lim, double initialBal) { 
		customer = cust;
		bank = bk;
		account = acnt;
		limit = lim;
		balance = initialBal;
	}
	public CreditCard(String cust, String bk, String acnt, int lim) {
		this(cust, bk, acnt, lim, 0.0); // this
	}
	// Accessor methods:
	public String getCustomer() { return customer; } 
	public String getBank() 	{ return bank; }
	public String getAccount()  { return account; } 
	public int getLimit() 		{ return limit; }
	public double getBalance()  { return balance; } 
	
	/**
	  * Charges the given price to the card, assuming sufficient credit limit. 
	  * @param price the amount to be charged
	  * @return true if charge was accepted; false if charge was denied 
	  * Update methods:
	  */
	public boolean charge(double price) {  	
		if (price + balance > limit) {		
			return false;  					
			}					
		balance += price; 					
		return true;   					
	}
	/**
	  * Processes customer payment that reduces balance. 
	  * @param amount the amount of payment made
	  */
	public void makePayment(double amount) {  // make a payment
		balance -= amount; 
	}

	// Utility method to print a card's information 
	public static void printSummary(CreditCard card) {
		println ''
		System.out.println("Customer = " + card.customer); 
		System.out.println("Bank = " + card.bank); 
		System.out.println("Account = " + card.account); 
		System.out.println("Balance = " + card.balance); 
		System.out.println("Limit = " + card.limit);
	}

	public static void main(String[] args) {
		CreditCard[] wallet = new CreditCard[3];
		wallet[0] = new CreditCard("John Bowman", "California Savings", "5391 0375 9387 5309", 5000); 
		wallet[1] = new CreditCard("John Bowman", "California Federal", "3485 0399 3395 1954", 3500); 
		wallet[2] = new CreditCard("John Bowman", "California Finance", "5391 0375 9387 5309", 2500, 3000);
		for (int val = 1; val <= 16; val++) { 
			wallet[0].charge(3 * val); 
			wallet[1].charge(2 * val); 
			wallet[2].charge(val);
		}
		for (CreditCard card : wallet) { 
			CreditCard.printSummary(card); 
			while (card.getBalance() > 200.0) {
				card.makePayment(200);
				// calling static method
				System.out.println("New balance = " + card.getBalance()); 
			}
		} 
	}

}