package javai.model;

public class Benz implements Car {
	private int speed;

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int speedUp(int km) {
		this.speed += km;
		return this.speed;
	}

	public boolean stop() {
		// TODO Auto-generated method stub
		this.speed = 0;
		return true;
	}

	public boolean isStart() {
		// TODO Auto-generated method stub
		
		return this.speed > 0;
	}
}