package br.com.yaman.bo;

public class Pessoa {
	String nome;
	int idade;
	String endereco;
	String cpf;
	ContaCorrente contaCorrente;
	ContaPoupanca contaPoupanca;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public ContaCorrente getContaCorrente() {
		return contaCorrente;
	}

	public void setContaCorrente(ContaCorrente contaCorrente) {
		this.contaCorrente = contaCorrente;
	}

	public ContaPoupanca getContaPoupanca() {
		return contaPoupanca;
	}

	public void setContaPoupanca(ContaPoupanca contaPoupanca) {
		this.contaPoupanca = contaPoupanca;
	}

	public String toString() {
		return "Nome: " + this.nome + "\n Idade: " + this.idade + "\n Endereço: " + this.endereco + "\n CPF: " + this.cpf
				 + "\n ContaCorrente " + this.contaCorrente + "\n ContaPoupanca " + this.contaPoupanca ;

	}

}
