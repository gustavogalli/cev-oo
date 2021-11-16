package oo.aula04;

public class Caneta {
	public String modelo;
	private float ponta;
	private boolean tampada;
	private String cor;
	
	// Método construtor sem parâmetros
	public Caneta() {
		this.tampar();
		this.setCor("Azul");
	}
	
	// Método construtor com parâmetros
	public Caneta(String m, String c, float p) {
		this.setModelo(m);
		this.setCor(c);
		this.setPonta(p);
		this.tampar();
	}
	
	// Métodos acessores (getters) e modificadores (setters)
	public String getModelo() {
		return this.modelo;
	}
	
	public void setModelo(String m) {
		this.modelo = m;
	}
	
	public float getPonta() {
		return this.ponta;
	}
	
	public void setPonta(float p) {
		this.ponta = p;
	}
	
	public void tampar() {
		this.setTampada(true);
	}
	
	public void destampar() {
		this.setTampada(false);
	}
	

	public boolean isTampada() {
		return tampada;
	}

	public void setTampada(boolean tampada) {
		this.tampada = tampada;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void status() {
		System.out.println("SOBRE A CANETA:");
		System.out.println("Modelo: " + this.getModelo());
		System.out.println("Cor: " + this.getCor());
		System.out.println("Ponta: " + this.getPonta());
		System.out.println("Tampada? " + this.isTampada());
	}
}
