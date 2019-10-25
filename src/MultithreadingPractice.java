
class class1 extends Thread
{
	public void run()
	{
		for(int i= 0;i<5;i++)
		{
			System.out.println("Rakibul");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class class2 extends Thread
{
	public void run()
	{
		for(int i= 0;i<5;i++)
		{
			System.out.println("Sadik");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class MultithreadingPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class1 obj1 = new class1();
		class2 obj2 = new class2();
		obj1.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		obj2.start();
		

	}

}
