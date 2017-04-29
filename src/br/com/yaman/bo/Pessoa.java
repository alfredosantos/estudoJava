package br.com.yaman.bo;

import java.util.ArrayList;
import java.util.List;

import br.com.yaman.common.Cpf;

public class Pessoa {
	String nome;
	int idade;
	Endereco endereco;
	Cpf cpf;
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

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Cpf getCpf() {
		return cpf;
	}

	public void setCpf(Cpf cpf) {
			this.cpf = cpf;
	}

	public List<Conta> getListContaPessoa() {
		return listContaPessoa;
	}

	public void setListContaPessoa(List<Conta> listContaPessoa) {
		this.listContaPessoa = listContaPessoa;
	}

	public Boolean incluirConta(Conta conta){
		for (Conta contaInclusao : listContaPessoa){
			if (contaInclusao.getNumero() == conta.getNumero()){
				return false;
			}
		}
		listContaPessoa.add(conta);
		return true;
	}
	
	public Conta getConta(int numeroConta){
		for (Conta conta : listContaPessoa){
			if (conta.getNumero() == numeroConta) {
				return conta;
			} 
		}
		return null;
	}
	
	public Boolean depositoConta(int numeroConta, double valor){
		for (Conta conta : listContaPessoa){
			if (conta.getNumero() == numeroConta) {
				conta.depositarValor(valor);
				return true;
			} 
		}
		return false;
	}
	
	public Boolean removerConta(int numeroConta){
		Conta contaTemp = new ContaCorrente();
		for (Conta conta : listContaPessoa){
			if (conta.getNumero() == numeroConta) {
				contaTemp = conta;
			} 
		}
		return listContaPessoa.remove(contaTemp);
	}
	
	public Boolean saqueConta(int numeroConta, double valor) throws Exception{

		for (Conta conta : listContaPessoa){
			if (conta.getNumero() == numeroConta){
					conta.saque(valor);
					return true;
				}
		}
		return false;
	}
	
	public String toString() {
		String contas = "";
		for (Conta conta : listContaPessoa) {
			contas += conta;
		}
		return "Nome: " + this.nome + "\n Idade: " + this.idade + "\n Endereço: " + this.endereco + "\n CPF: " + this.cpf + "\n Contas " + contas;

	}

}
