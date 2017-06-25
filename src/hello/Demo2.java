package hello;
/**
 * 生产者消费者问题
 * 多生产者多消费者解决方案
 * */

class Resource{
	private String name;
	private int count=1;
	private boolean flag=false;
	public synchronized void set(String name){
		while(flag)
			try{this.wait();}catch(InterruptedException e){}

		this.name=name+count;
		count++;
		System.out.println(Thread.currentThread().getName()+"....生产者....."+this.name);
		flag=true;
		notifyAll();
	}
	public synchronized void out(){
		while(!flag)
			try{this.wait();}catch(InterruptedException e){}
		System.out.println(Thread.currentThread().getName()+"....消费者..........."+this.name);
		flag=false;
		notifyAll();
		
	}
}
class Producter implements Runnable{
	private Resource r;
	Producter(Resource r){
		this.r=r;
	}
	public void run(){
		while(true){
			r.set("烤鸭");
		}
		
	}
}

class Consumer implements Runnable{
	private Resource r;
	Consumer(Resource r){
		this.r=r;
	}
	public void run(){
		while(true){
			r.out();
		}
		
	}
}

public class Demo2 {

	public static void main(String[] args) {
		Resource r=new Resource();
		Producter p=new Producter(r);
		Consumer c=new Consumer(r);
		
		Thread t1=new Thread(p);
		Thread t2=new Thread(p);
		Thread t3=new Thread(c);
		Thread t4=new Thread(c);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}

}
