/**
 * 
 */

/**
 * @author CloudStrife
 * A cash register totals up sales and computes change due.
 */
public class CashRegister
{
	private double purchase;
	private double payment;
	private int itemCounter;
	public static final double QUARTER_VALUE = 0.25;
	public static final double DIME_VALUE = 0.1;
	public static final double NICKEL_VALUE = 0.05;
	public static final double PENNY_VALUE = 0.01;

	/**
	 * Constructs a CashRegister
	 */
	public CashRegister()
	{
		purchase = 0;
		payment = 0; 
		itemCounter = 0;
	}

	/**
	 * Records the sale of an item.
	 * @param amount the price of the item
	 */
	public void recordPurchase(double amount)
	{
		double newTotal = purchase + amount;
		purchase = newTotal;
		itemCounter++;
	}

	/**
	 * Computes the change due and resets the machine for the next
	 * customer.
	 * @return the change due to the customer
	 */
	public double giveChange()
	{
		double change = payment - purchase;
		purchase = 0;
		payment = 0;
		itemCounter = 0;
		return change;
	}

	public int getItemCount()
	{
		return itemCounter;
	}

	/**
	 * Enters the payment received from the customer.
	 * @param dollars the number of dollars in the payment
	 * @param quarters the number of quarters in the payment
	 * @param dimes the number of dimes in the payment
	 * @param nickels the number of nickels in the payment
	 * @param pennies the number of pennies in the payment
	 */
	public void enterPayment(int dollars, int quarters,
			int dimes, int nickels, int pennies)
	{
		payment = dollars + quarters * QUARTER_VALUE + dimes *
				DIME_VALUE
				+ nickels * NICKEL_VALUE + pennies * PENNY_VALUE;
	}


	/**
	 * Add given number of dollars to payment.
	 * @param dollars number of dollars paid
	 */
	public void enterDollars(int dollars)
	{
		payment += (dollars * 1.0); 
	}

	/**
	 * Add given number of quarters to payment.
	 * @param quarters number of quarters paid
	 */
	public void enterQuarters(int quarters)
	{
		payment += (quarters * QUARTER_VALUE);
	}

	/**
	 * Add given number of dimes to payment.
	 * @param dimes number of dimes paid
	 */
	public void enterDimes(int dimes)
	{
		payment += (dimes * DIME_VALUE);
	}

	/**
	 * Add given number of nickels to payment.
	 * @param nickels number of nickels paid
	 */
	public void enterNickels(int nickels)
	{
		payment += (nickels * NICKEL_VALUE);
	}

	/**
	 * Add given number of pennies to payment.
	 * @param pennies number of pennies paids
	 */
	public void enterPennies(int pennies)
	{
		payment += (pennies * PENNY_VALUE);
	}

}

