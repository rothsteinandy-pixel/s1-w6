// Refillable version 2
//
public class Refillable {

	private int myAmount;
	private int myUseUpCallCount;
	private int myTotalUse;

	// Initialize a Refillable object having initialAmount units.
	public Refillable(int initialAmount) {
		if (initialAmount > 0)
			myAmount = initialAmount;
		// myUseUpCallCount = 0;
		// myTotalUse = 0;
	}


	// Use amount units.
	public void useUp(int amount) {
		if(0<amount){
			if(amount>myAmount){
				System.out.println("we don't have that much");
				amount = myAmount;
			}
			myAmount -=  amount;
			myTotalUse +=  amount;
			myUseUpCallCount ++;
				
		}
			
		
	}

	// Add amount to the current amount.
	public void refill(int amount) {
		if (0 < amount)
			myAmount = myAmount + amount;
	}

	// Return the current amount.
	public int currentAmount() {
		return myAmount;
	}

	public double averageUse() {
		if(myUseUpCallCount>0)
			return myTotalUse / (myUseUpCallCount * 1.0);
		
		return 0; 
	
		
	}
}