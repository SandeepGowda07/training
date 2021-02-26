package banktransaction;

public class TransactionDeposit implements Runnable {
	int amount;
	Account accountX;
	TransactionDeposit(Account x, int amount){
	accountX = x;
	this.amount = amount;
	new Thread(this).start();
	}
	public void run(){
	try {
		accountX.Deposit(amount);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	}

}
