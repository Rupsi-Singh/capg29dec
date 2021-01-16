package approach2;


public class ThreadDemo {

	public static void main(String[] args) {
		
		MyThread target=new MyThread();
		Thread thread1 = new Thread(target);
		Thread thread2=new Thread(target);
		thread1.setName("Pranjali");
		thread2.setName("Rishita");
		thread1.start();
		thread2.start();
	}

}
