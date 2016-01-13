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
	private double payment, change;
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
		change = payment - purchase;
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
	
	/**
	 * Returns the number of dollars in change.
	 * @return the number of dollars in change
	 */
	public int giveDollars()
	{
		double dollars = 0;
		for(int i = 0; (i * 1.0) <= change; i++)
		{
			dollars = i * 1.0;
		}
		change -= dollars;
		
		return (int)dollars;
	}
	
	/**
	 * Returns the number of quarters in change.
	 * @return the number of quarters in change
	 */
	public int giveQuarters()
	{
		int numOfQuarters = 0;
		for(int i = 0; (i * QUARTER_VALUE) <= change; i++)
		{
			numOfQuarters = i;
		}
		change -= (numOfQuarters * QUARTER_VALUE);
		
		return numOfQuarters;
	}
	
	/**
	 * Returns the number of dimes in change.
	 * @return the number of dimes in change
	 */
	public int giveDimes()
	{
		int numOfDimes = 0;
		for(int i = 0; (i * DIME_VALUE) <= change; i++)
		{
			numOfDimes = i;
		}
		change -= (numOfDimes * DIME_VALUE);
		
		return numOfDimes;
	}
	
	/**
	 * Returns the number of nickels in change.
	 * @return the number of nickels in change
	 */
	public int giveNickels()
	{
		int numOfNickels = 0;
		for(int i = 0; (i * NICKEL_VALUE) <= change; i++)
		{
			numOfNickels = i;
		}
		change -= (numOfNickels * NICKEL_VALUE);
		
		return numOfNickels;
	}
	
	/**
	 * Returns the number of pennies in change.
	 * @return the number of pennies in change
	 */
	public int givePennies()
	{
		int numOfPennies = 0;
		for(int i = 0; (i * PENNY_VALUE) <= change; i++)
		{
			numOfPennies = i;
		}
		change -= (numOfPennies * PENNY_VALUE);
		
		return numOfPennies;
	}

}

