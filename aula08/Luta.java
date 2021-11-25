package oo.aula08;

public class Luta {

	private Lutador desafiado;
	private Lutador desafiante;
	private int round;
	private boolean aprovada;

	public void marcarLuta(Lutador desafiado, Lutador desafiante) {
//		luta só pode ser marcada entre lutadores da mesma categoria
//		desafiado e desafiante devem ser pessoas diferentes
//		só pode se estiver aprovada
//		ou vitória de um dos lutadores ou empate
		if (desafiado.getCategoria() == desafiante.getCategoria() && desafiado != desafiante) {
			this.setAprovada(true);
			this.desafiado = desafiado;
			this.desafiante = desafiante;
		}

	}

	public void lutar(Lutador desafiado, Lutador desafiante) {
		if (this.isAprovada() == true) {
			desafiado.apresentar();
			System.out.println("---------------------------");
			desafiante.apresentar();
			System.out.println("===========================	");

			double vencedor = Math.random();
			if (vencedor <= 0.4) {
				System.out.println("Empate!");
				desafiado.setEmpates(desafiado.getEmpates() + 1);
				desafiante.setEmpates(desafiante.getEmpates() + 1);
			} else if (vencedor <= 0.7) {
				System.out.println("Vence " + this.desafiado.getNome() + "!");
				desafiado.setVitorias(desafiado.getVitorias() + 1);
				desafiante.setDerrotas(desafiado.getDerrotas() + 1);
			} else {
				System.out.println("Vence " + this.desafiante.getNome() + "!");
				desafiante.setVitorias(desafiado.getVitorias() + 1);
				desafiado.setDerrotas(desafiado.getDerrotas() + 1);
			}

			System.out.println("===========================");

			desafiado.apresentar();
			System.out.println("---------------------------");
			desafiante.apresentar();
			System.out.println("---------------------------");

		} else {
			System.out.println("Luta não pode acontecer.");
		}

	}

	public Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	public Lutador getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public int getRound() {
		return round;
	}

	public void setRound(int round) {
		this.round = round;
	}

	public boolean isAprovada() {
		return aprovada;
	}

	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}

}
