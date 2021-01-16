package approach3;


public class ThreadDemo {

	public static void main(String[] args) {
		
		MyThread target = new MyThread();
		for (int i = 1; i <=5; i++) {
			new Thread(target).start();
		}
	}

}
