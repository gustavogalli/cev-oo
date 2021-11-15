package oo.aula2;

public class Guitarra {
	String marca;
	String modelo;
	String cor;
	int quantidadeCordas;
	float volumeMaximo;
	boolean plugada;
	boolean ligada;
	
	void ligar() {
		this.ligada = true;
	}
	
	void desligar() {
		this.ligada = false;
	}
	
	void plugar() {
		this.plugada = true;
	}
	
	void desplugar() {
		this.plugada = false;
	}
	
	void tocar() {
		System.out.println("Som na caixa...");
	}
	
	void status() {
		System.out.println(this.marca + " | " + this.modelo + " | " + this.cor + " | " + this.quantidadeCordas  + " cordas");
	}

}
