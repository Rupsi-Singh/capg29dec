package approach1;


public class ThreadDemo {

	public static void main(String[] args) {
		
		MyThread thread1=new MyThread();
		MyThread thread2=new MyThread();
		thread1.setName("Pranjali");
		thread2.setName("Rishita");
		thread1.start();
		thread2.start();
	}

}
