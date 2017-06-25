package hello;

public class Demo {

	public static void main(String[] args) {
		Ticket d=new Ticket();
		Thread d1=new Thread(d);
		Thread d2=new Thread(d);
		d1.start();
		d2.start();
	}

}
class Ticket implements Runnable{
	private int num=100;
	public void run(){
		while(num>0){
			if(num>0){
			    System.out.println(Thread.currentThread().getName()+"sale"+num--);
			}
		}
	}  
}