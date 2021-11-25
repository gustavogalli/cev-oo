package oo.aula11;

public class Bolsista extends Aluno {

	private int bolsa;
	
	public void renovarBolsa() {
		System.out.println("Renovando bolsa...");
	}
	
	@Override
	public void pagarMensalidade() {
		System.out.println("Bolsista pagando mensalidade");
	}

	public int getBolsa() {
		return bolsa;
	}

	public void setBolsa(int bolsa) {
		this.bolsa = bolsa;
	}
	
	
	
}
