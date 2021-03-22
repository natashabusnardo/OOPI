package Exercicio09;

public class SistemaBancario {

	private int numeroConta = 0;
	private String nome = "";
	private double saldo = 0;
	
	public SistemaBancario(String nome, int numeroConta, double saldo) {
		setNome(nome);
		setNumeroConta(numeroConta);
		setSaldo(saldo);
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void incluirConta(int codigoContasExistentes[], int totalContasExistentes) {
		totalContasExistentes++;
		codigoContasExistentes[totalContasExistentes] = numeroConta;
		
		System.out.println(totalContasExistentes);
		System.out.println(codigoContasExistentes[totalContasExistentes]);
	}
	
	public void alterarNome(String novoNome) {
		nome = novoNome;
	}
	
	public boolean validarDeposito(double valorDeposito) {
		if(valorDeposito > 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public void deposito(double valorDeposito) {
		if(validarDeposito(valorDeposito) == true) {
			saldo = saldo + valorDeposito;
		}
	}
	
	public boolean validarSaque(double valorSaque) {
		if(saldo >= valorSaque)
			return true;
		else {
			return false;
		}
	}
	
	public void saque(double valorSaque) {
		if(validarSaque(valorSaque) == true)
			saldo = saldo - valorSaque;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SistemaBancario [numeroConta=");
		builder.append(numeroConta);
		builder.append(", nome=");
		builder.append(nome);
		builder.append(", saldo=");
		builder.append(saldo);
		builder.append("]");
		return builder.toString();
	}
}
