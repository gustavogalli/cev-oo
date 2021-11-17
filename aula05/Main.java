package oo.aula05;

public class Main {
	public static void main(String[] args) {
		
		ContaBanco c1 = new ContaBanco();
		
		c1.abrirConta("CC", 1234);
		c1.setDono("Carlos Alberto");
		c1.sacar(50);
		c1.depositar(100);
		c1.pagarMensalidade();
		c1.sacar(88);
		c1.fecharConta();
		
		c1.situacao();
		
	}
}