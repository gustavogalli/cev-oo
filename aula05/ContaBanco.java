package oo.aula05;

public class ContaBanco {
	// tipo da conta - CC corrente e CP poupança
	// abrir conta - status -> true // se CC = saldo + 50 , se CP saldo 150 reais
	// fechar conta = nao pode ter saldo nem negativo
	// depositar = conta deve estar aberta
	// sacar = conta aberta e deve ter dinheiro na conta
	// pagar mensal = CC paga 12 -- CP paga 20 reais
	
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	public boolean status;
	
	public ContaBanco() {
		this.setSaldo(0);
		this.setStatus(false);
	}
	
	public void abrirConta(){
		
	}
	
	public void fecharConta() {
		
	}
	
	public void depositar() {
		
	}
	
	public void sacar() {
		
	}
	
	public void pagarMensalidade() {
		
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