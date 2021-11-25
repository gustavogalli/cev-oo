package oo.aula09;

public class Main {

	public static void main(String[] args) {
		
//			public Livro(String titulo, String autor, int totPaginas, boolean aberto, Pessoa leitor) {
		
		Pessoa pessoa1 = new Pessoa("Juliana");
		Livro livro1 = new Livro("O Hobbit", "J. R. R. Tolkien", 350, false, pessoa1);
		
		livro1.abrir();
//		livro1.fechar();
		livro1.folhear(22);
		livro1.avançarPag();
		livro1.avançarPag();
		livro1.avançarPag();
		livro1.folhear(livro1.getTotPaginas());
		livro1.avançarPag();
		livro1.voltarPag();
		livro1.voltarPag();
		livro1.voltarPag();
		livro1.voltarPag();
		livro1.voltarPag();
		livro1.fechar();
		livro1.detalhes();
		
		System.out.println("-------------------");
		
		Pessoa pessoa2 = new Pessoa("Gustavo");
		Livro livro2 = new Livro("O livro dos espíritos", "Allan Kardec", 250, false, pessoa2);
		
		livro2.abrir();
		livro2.folhear(125);
		livro2.detalhes();
		
		
	}
}