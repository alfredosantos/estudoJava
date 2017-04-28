package br.com.yaman.bo;

public class ContaCorrente extends Conta{

	@Override
	public void depositarValor(double valor) {
		double valorNovo;
		valorNovo = this.getSaldo() + valor;
		this.setSaldo(valorNovo);
		
	}

}