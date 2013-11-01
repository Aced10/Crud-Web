package presentation;

public class Card implements Runnable{
	
	private Thread hilo;
	private boolean run;
	private int speed;
	
	public Card() {
		hilo = new Thread(this);
		run = true;
	}
	
	public void run() {
		while (run) {
			System.out.println("aaaaa");
			try {
				hilo.sleep(speed);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}				
		}				
	}
	
	public void stop(){
		run = false;
		notify();
	}

	public Thread getHilo() {
		return hilo;
	}

	public void setHilo(Thread hilo) {
		this.hilo = hilo;
	}

	public boolean isRun() {
		return run;
	}

	public void setRun(boolean run) {
		this.run = run;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
}
