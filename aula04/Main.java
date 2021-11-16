package oo.aula04;

public class Main {

	public static void main(String[] args) {
		
		Caneta c1 = new Caneta();
		
		c1.setModelo("BIC");
		c1.setPonta(0.5f);
		c1.status();
		
		System.out.println("-------------");
		
		Caneta c2 = new Caneta("BIC Cristal", "Vermelha", 0.8f);
		c2.status();
	}
}