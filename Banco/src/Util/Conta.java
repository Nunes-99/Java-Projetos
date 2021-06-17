package Util;

public class Conta {
	
	private String conta;
	public String nome;
	private double valor;
	private double saldo;
	
	public Conta (String conta, String nome, double valor) {
		this.conta = conta;
		this.nome = nome;
		this.valor = valor;
	}

	public String getConta() {
		return conta;
	}
	public void setConta(String conta) {
		this.conta = conta;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}

	
	public double deposito(double valor) {
		this.valor = this.valor + valor;
		return valor;
	}
	
	public double saque(double valor) {
		this.valor = this.valor - valor - 5.00;
		return valor;
	}

	
	public String toString() {
		return "Conta "
				+ "\nConta: " + getConta()
				+", Nome: " + getNome()
				+", Saldo: R$" + getValor();
	}
	
	

}
