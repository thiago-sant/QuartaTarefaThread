package controller;

public class ThreadSapo extends Thread {
	private int distanciaMax;
	private int saltoMax;
	private int percorrido;
	private int x;
	static int posicao = 1;
	
	public ThreadSapo (int distanciaMax, int saltoMax, int percorrido, int x ){
		this.distanciaMax = distanciaMax;
		this.saltoMax = saltoMax;
		this.percorrido = percorrido;
		this.x = x;
	}
	
	@Override
	public void run() {
		CorridaSapo();
	}
	
	public void CorridaSapo() {
		System.out.println("Sapo #"+x+" deu um salto de "+saltoMax+" metros numa distância de "+distanciaMax+" metros");
		percorrido = percorrido + saltoMax;
		while (percorrido < distanciaMax) {
			saltoMax = (int)(Math.random()*41) + 10;
			percorrido = percorrido + saltoMax;
			System.out.println("Sapo #"+x+" deu um salto de "+saltoMax+" metros numa distância de "+distanciaMax+" metros.");
		}
		System.out.println("Sapo #"+x+" finalizou a corrida em #" +posicao+ " lugar");
		posicao++;
		
	}
}