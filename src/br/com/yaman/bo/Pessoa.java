package br.com.yaman.bo;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
	String nome;
	int idade;
	String endereco;
	String cpf;
	List<Conta> listContaPessoa = new ArrayList<Conta>();

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

	public List<Conta> getListContaPessoa() {
		return listContaPessoa;
	}

	public void setListContaPessoa(List<Conta> listContaPessoa) {
		this.listContaPessoa = listContaPessoa;
	}

	public String toString() {
		String contas = "";
		for (Conta conta : listContaPessoa) {
			contas += conta;
		}
		return "Nome: " + this.nome + "\n Idade: " + this.idade + "\n Endereço: " + this.endereco + "\n CPF: " + this.cpf + "\n Contas " + contas;

	}

}
