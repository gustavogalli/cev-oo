package oo.aula05;

public class ContaBanco {
	// tipo da conta - CC corrente e CP poupança
	// abrir conta - status -> true //
	// na hora de abrir, dizer se é CC ou CP --- se CC = saldo + 50 , se CP saldo
	// 150 reais

	// fechar conta = nao pode ter saldo nem negativo
	// depositar = conta deve estar aberta
	// sacar = conta aberta e deve ter dinheiro na conta
	// pagar mensal = CC paga 12 -- CP paga 20 reais
	// construtor = saldo 0 - status false

	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	public boolean status;

	public ContaBanco() {
		this.setSaldo(0);
		this.setStatus(false);
	}

	public void situacao() {
		System.out.println("NÚMERO DA CONTA: " + this.getNumConta());
		System.out.println("TIPO: " + this.getTipo());
		System.out.println("DONO: " + this.getDono());
		System.out.println("SALDO: R$ " + this.getSaldo());
		if (isStatus()) {
			System.out.println("STATUS: ABERTA");
		} else {
			System.out.println("STATUS: FECHADA");
		}
	}

	public void abrirConta(String tipo, int num) {
		if (tipo.equalsIgnoreCase("CC")) {
			this.setTipo(tipo);
			this.setStatus(true);
			this.setNumConta(num);
			this.setSaldo(50);
		} else if (tipo.equalsIgnoreCase("CP")) {
			this.setTipo(tipo);
			this.setStatus(true);
			this.setNumConta(num);
			this.setSaldo(150);
		} else {
			System.out.println("Tipo inválido.");
		}
	}

	public void fecharConta() {
		if (this.isStatus()) {
			if (this.getSaldo() != 0) {
				System.out.println("Não é possível fechar a conta. O saldo não está zerado (R$ " + this.getSaldo() + ") ");
			} else {
				System.out.println("Conta fechada com sucesso.");
				this.setStatus(false);
			}
		} else {
			System.out.println("A conta já está fechada.");
		}
	}

	public void depositar(int valor) {
		if (this.isStatus()) {
			this.setSaldo(getSaldo() + valor);
		} else {
			System.out.println("Não é possível depositar. A conta está fechada.");
		}
	}

	public void sacar(int valor) {
		if(this.isStatus()) {
			if(this.getSaldo() >= valor) {
				this.setSaldo(this.getSaldo() - valor);
				System.out.println("Sacando R$ " + valor);
			} else {
				System.out.println("Erro! Você não tem todo esse dinheiro pra sacar.");
			}
		} else {
			System.out.println("Não é possível sacar. A conta está fechada.");
		}

	}

	public void pagarMensalidade() {
		if(this.getTipo().equalsIgnoreCase("CC")) {
			System.out.println("Pagando mensalidade de R$ 12");
			this.setSaldo(this.getSaldo() - 12);
		} else {
			System.out.println("Pagando mensalidade de R$ 20");
			this.setSaldo(this.getSaldo() - 20);
		}
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}