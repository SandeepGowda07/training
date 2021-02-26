package banktransaction;

public class TransactionWithdraw implements Runnable{
	int amount;
	Account accountY;
	TransactionWithdraw(Account y, int amount) {
	accountY = y;
	this.amount = amount;
	new Thread(this).start();
	}
	public void run(){
	try {
		accountY.withdraw(amount);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	}

}
