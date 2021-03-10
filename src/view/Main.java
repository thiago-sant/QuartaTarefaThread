package view;

import controller.ThreadSapo;

public class Main {
	public static void main(String[] args) {
		int distanciaMax;
		int saltoMax;
		int percorrido;
		for (int x = 1; x <= 5; x++) {
			saltoMax = (int)(Math.random()*41) + 10;
			distanciaMax = 100;
			percorrido = 0;
			Thread threadsapo = new ThreadSapo(distanciaMax, saltoMax, percorrido, x);
			threadsapo.start();
		}
	}
}
