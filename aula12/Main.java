package oo.aula12;

public class Main {
	public static void main(String[] args) {
		
		Mamifero m = new Mamifero();
		Reptil r = new Reptil();
		Peixe p = new Peixe();
		Ave a = new Ave();
		
		m.locomover();
		r.locomover();
		p.locomover();
		a.locomover();
		
		m.alimentar();
		r.alimentar();
		p.alimentar();
		a.alimentar();
		
	}
}
