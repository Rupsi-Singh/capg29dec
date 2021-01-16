package approach1;

public class MyThread extends Thread{
	
	@Override
	public void run() {
		String threadName = Thread.currentThread().getName();
		displayNumbers(threadName);
	}

	private void displayNumbers(String threadName) {
		for (int i = 1; i <=10; i++) {
			System.out.println(threadName +" : "+i);
		}
	}

}
