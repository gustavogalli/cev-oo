package oo.aula3;

public class Caneta {
//	Atributos
	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	protected boolean tampada;

	
//	Métodos
	public void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Cor: " + this.cor);
		System.out.println("Carga: " + this.carga);
		System.out.println("Tampada: " + this.tampada);
	}
	
	public void rabiscar() {
		if(tampada) {
			System.out.println("Erro! Não posso rabiscar!");
		} else {
			System.out.println("Rabiscando...");
		}
	}

	protected void tampar() {
		this.tampada = true;
	}
	
	protected void destampar() {
		this.tampada = false;
	}

}
