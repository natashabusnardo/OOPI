package Exercicio03;

public class MainConta {

	public static void main(String[] args) {
		

		
		ContaSimples simples = new ContaSimples();
		
		simples.setSaldoPoupanca(123);
		simples.setAgencia(12345);
		simples.setNumeroDaConta(99999);
		simples.setSaldo(100000);
		
		System.out.println(simples.depositoPoupanca(500));
		System.out.println(simples.saquePoupanca(100));
		System.out.println(simples.deposito(400));
		System.out.println(simples.saque(150));
		
		simples.banco.setCodigo(111);
		simples.banco.setNome("BB");
		simples.banco.setNumeroAgencias(5);
		simples.correntista.setNome("Fulano");
		simples.correntista.setEndereco("Rua Bulcão");
		System.out.println(simples.toString());
		
		
		ContaEspecial especial = new ContaEspecial();
		
		especial.setDiasSemJuros(25);
		especial.setLimite(1000);
		especial.setAgencia(54321);
		especial.setNumeroDaConta(22222);
		especial.setSaldo(23500);
		
		System.out.println(especial.deposito(5000));
		System.out.println(especial.saque(700));
		
		especial.banco.setCodigo(123);
		especial.banco.setNome("BB");
		especial.banco.setNumeroAgencias(5);
		especial.correntista.setNome("Ciclano");
		especial.correntista.setEndereco("Rua Bulcão2");
		especial.cartao.setLimite(20000);
		especial.cartao.setNumero(321);
		especial.cartao.setOperadora("MasterCard");
		especial.cartao.setTipoDeCartao("Débito");
		System.out.println(especial.toString());
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
