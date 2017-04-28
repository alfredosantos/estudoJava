package br.com.yaman.bo;
public abstract class Conta {
	int numero;
	int agencia;
	double saldo;
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public double getSaldo() {
		return saldo;
	}
	protected void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public abstract void depositarValor(double valor);
	
	public String toString(){
		return "\n Numero: " + this.numero + " Agencia: " + this.agencia + " Saldo: " + this.saldo;
	}

}
