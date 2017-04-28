import java.util.ArrayList;
import java.util.List;

import br.com.yaman.bo.Conta;
import br.com.yaman.bo.ContaCorrente;
import br.com.yaman.bo.ContaPoupanca;
import br.com.yaman.bo.Pessoa;

public class Main {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("João");
		pessoa.setEndereco("Rua 1");
		pessoa.setIdade(18);
		pessoa.setCpf("1234567");
		
		trabalharComConta(pessoa);
		
		System.out.println(pessoa);
		
	}
	public static void inclusaoDeContas(Pessoa pessoa){
		
		
	}
	
	public static void trabalharComConta(Pessoa pessoa){
		ContaCorrente contaCorrente = new ContaCorrente();
		contaCorrente.setAgencia(123);
		contaCorrente.setNumero(1);
		
		ContaCorrente contaCorrente2 = new ContaCorrente();
		contaCorrente2.setAgencia(123);
		contaCorrente2.setNumero(2);
		
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		contaPoupanca.setAgencia(123);
		contaPoupanca.setNumero(3);
		
		ContaPoupanca contaPoupanca2 = new ContaPoupanca();
		contaPoupanca2.setAgencia(123);
		contaPoupanca2.setNumero(4);
		
		ContaPoupanca contaPoupanca3 = new ContaPoupanca();
		contaPoupanca3.setAgencia(123);
		contaPoupanca3.setNumero(5);
		
		List<Conta> listContas = new ArrayList<Conta>();
		
		listContas.add(contaCorrente);
		listContas.add(contaCorrente2);
		listContas.add(contaPoupanca);
		listContas.add(contaPoupanca2);
		listContas.add(contaPoupanca3);
		
		pessoa.setListContaPessoa(listContas);
		
		for (Conta conta : pessoa.getListContaPessoa()) {
			conta.depositarValor(13.09);
		}
	}
}