package oo.aula02;

public class Main {

	public static void main(String[] args) {
		
		Caneta c1 = new Caneta();
		
		c1.cor = "Azul";
		c1.ponta = 0.5f;
		c1.tampada = true;
		
		c1.status();
		c1.destampar();
		c1.rabiscar();
		
		Caneta c2 = new Caneta();
		c2.cor = "Vermelha";
		c2.ponta = 1.0f;
		c2.tampada = false;
		c2.modelo = "Bic Cristal";
		c2.carga = 100;
	
		
		System.out.println();
		c2.status();
		c2.tampar();
		c2.rabiscar();
		
		
		Guitarra g1 = new Guitarra();
		
		g1.marca = "Gibson";
		g1.modelo = "Les Paul";
		g1.quantidadeCordas = 6;
		g1.cor = "Sunburst";
		g1.status();
		g1.tocar();
	}
}