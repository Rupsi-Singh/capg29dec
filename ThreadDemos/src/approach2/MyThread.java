package approach2;

public class MyThread implements Runnable{
	
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
