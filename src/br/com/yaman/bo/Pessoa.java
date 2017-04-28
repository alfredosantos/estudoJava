package br.com.yaman.bo;

public class Pessoa {
	String nome;
	int idade;
	String endereco;
	String cpf;
	Conta conta;

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

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	public String toString() {
		return "Nome: " + this.nome + "\n Idade: " + this.idade + "\n Endereço: " + this.endereco + "\n CPF: " + this.cpf
				 + "\n Conta " + this.conta;

	}

}
