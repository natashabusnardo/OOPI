package Exercicio09;

public class SistemaBancarioMain {

	public static void main(String[] args) {

		int numeroConta = 12345;
		String nome = "Mathias";
		double saldo = 1000000;
		
		SistemaBancario sb = new SistemaBancario(nome, numeroConta, saldo);
		
		System.out.println(sb.toString());
		
		int totalContasExistentes = 123;
		int codigoContasExistentes[] = new int[500];
		sb.incluirConta(codigoContasExistentes, totalContasExistentes);
		sb.alterarNome("Artur");
		
		double valorDeposito = 200;
		System.out.println(sb.validarDeposito(valorDeposito));
		sb.deposito(valorDeposito);
		
		double valorSaque = 2000000;
		System.out.println(sb.validarSaque(valorSaque));
		sb.saque(valorSaque);
		
		System.out.println(sb.toString());
		
	}
}
