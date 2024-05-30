package javai;

import javai.model.Benz;
import javai.model.Car;
import javai.model.Genesis;
import javai.model.Lambor;
import javai.model.Porche;

public class Drive {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		extracted(new Lambor());
		extracted(new Porche());
		extracted(new Benz());
		extracted(new Genesis());
	}

	private static void extracted(Car car) {
		car.speedUp(100);
		System.out.println("포: " + car.getSpeed());
	}
}