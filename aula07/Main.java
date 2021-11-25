package oo.aula07;

public class Main {

	public static void main(String[] args) {

//			public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas,
		
		Lutador[] lutadores = new Lutador[6];
		lutadores[0] = new Lutador("João", "Brasileiro", 27, 1.72f, 98.0f, 0, 0, 0);
		lutadores[1] = new Lutador("Maria", "Sueca", 29, 1.70f, 97.8f, 0, 0, 0);
		lutadores[2] = new Lutador("Teovaldo", "Russo", 32, 1.90f, 104.2f, 0, 0, 0);
		lutadores[3] = new Lutador("Julien", "Finlandês", 18, 1.64f, 88.3f, 0, 0, 0);
		lutadores[4] = new Lutador("Gustaf", "Argentino", 40, 1.88f, 72.1f, 0, 0, 0);
		lutadores[5] = new Lutador("Karlsten", "EUA", 28, 1.56f, 45.2f, 0, 0, 0);
		
		
		lutadores[0].apresentar();
		lutadores[2].status();
	}
}