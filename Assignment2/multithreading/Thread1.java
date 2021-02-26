package package2;

public class Thread1 extends Thread {
	@SuppressWarnings("deprecation")
	public void run() {
		for(int i=0;i<=10;i++) {
			if(i==9) {
				System.out.println(" stopped "+Thread.currentThread().getName());
				stop();
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(" Running "+Thread.currentThread().getName() );
			
		}
	}
	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread t2 = new Thread(new Runnable() {
	public  void run() {
		for(int i=0;i<=10;i++) {
			Thread.yield();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(" Running"+Thread.currentThread().getName());
			
		}
	}
});
		
		t1.start();
		t2.start();
	
}
}
