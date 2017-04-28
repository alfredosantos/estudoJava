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
	
	public static void trabalharComConta(Pessoa pessoa){
		ContaCorrente contaCorrente = new ContaCorrente();
		contaCorrente.setAgencia(123);
		contaCorrente.setNumero(1);
		
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		contaPoupanca.setAgencia(676);
		contaPoupanca.setNumero(3);
		
		pessoa.setConta(contaPoupanca);
		
		pessoa.getConta().depositarValor(7.45);

	}

}
