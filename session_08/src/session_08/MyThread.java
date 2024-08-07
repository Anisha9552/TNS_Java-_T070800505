package session_08;

public class MyThread implements Runnable{


	@Override
	public void run() {
		for(int i = 0;i<=3;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
		
			try {
			Thread.sleep(1000);
		    }
			catch(InterruptedException e)
				{
			     e.printStackTrace();
		        }
			}
		}
	public static void main(String[] args) {
		MyThread r1=new MyThread();
		Thread t1=new Thread(r1);
		MyThread r2=new MyThread();
		Thread t2=new Thread(r2);
				
		t1.setName("one");
		t2.setName("two");
		t2.setPriority(Thread.MAX_PRIORITY);
		
		t1.start();
		t2.start();
	}

}
