package oo.aula02;

public class Caneta {
//	Atributos
	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada;

	
//	Métodos
	void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Cor: " + this.cor);
		System.out.println("Carga: " + this.carga);
		System.out.println("Tampada: " + this.tampada);
	}
	
	void rabiscar() {
		if(tampada) {
			System.out.println("Erro! Não posso rabiscar!");
		} else {
			System.out.println("Rabiscando...");
		}
	}

	void tampar() {
		this.tampada = true;
	}
	
	void destampar() {
		this.tampada = false;
	}

}
