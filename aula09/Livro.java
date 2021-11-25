package oo.aula09;

public class Livro implements Publicacao {

	private String titulo;
	private String autor;
	private int totPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;

	public Livro(String titulo, String autor, int totPaginas, boolean aberto, Pessoa leitor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.totPaginas = totPaginas;
		this.aberto = aberto;
		this.leitor = leitor;
	}

	public void detalhes() {
		System.out.println("Título: " + this.getTitulo());
		System.out.println("Autor: " + this.getAutor());
		System.out.println("Total de páginas: " + this.getTotPaginas());
		System.out.println("Página atual: " + this.getPagAtual());
		System.out.println("Aberto? " + this.isAberto());
		System.out.println("Leitor: " + leitor.getNome());
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getTotPaginas() {
		return totPaginas;
	}

	public void setTotPaginas(int totPaginas) {
		this.totPaginas = totPaginas;
	}

	public int getPagAtual() {
		return pagAtual;
	}

	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}

	public boolean isAberto() {
		return aberto;
	}

	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	public Pessoa getLeitor() {
		return leitor;
	}

	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}

	@Override
	public void abrir() {
		this.setAberto(true);
		this.setPagAtual(0);
	}

	@Override
	public void fechar() {
		this.setAberto(false);
		this.setPagAtual(0);
	}

	@Override
	public void folhear(int pagina) {
		if (this.isAberto()) {
			if (pagina > this.getTotPaginas()) {
				System.out.println("Página fora do livro!");
			} else {
				this.setPagAtual(pagina);
			}
		} else {
			System.out.println("Livro fechado.");
		}
	}

	@Override
	public void avançarPag() {
		if (this.isAberto()) {
			if (this.getPagAtual() == this.getTotPaginas()) {
				System.out.println("Já está na última página!");
			} else {
				this.setPagAtual(this.getPagAtual() + 1);
			}
		} else {
			System.out.println("Livro fechado.");
		}
	}

	@Override
	public void voltarPag() {
		if (this.isAberto()) {
			if (this.getPagAtual() == 0) {
				System.out.println("Já está na página inicial!");
			} else {
				this.setPagAtual(this.getPagAtual() - 1);
			}
		} else {
			System.out.println("Livro fechado.");
		}

	}

}
