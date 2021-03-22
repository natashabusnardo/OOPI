package Exercicio03;

public class ContaBancaria {

	private int agencia = 0;
	private int numeroDaConta = 0;
	private double saldo = 0;
	protected Banco banco;
	protected Pessoa correntista;
	
	public ContaBancaria() {
		banco = new Banco();
		correntista = new Pessoa();
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumeroDaConta() {
		return numeroDaConta;
	}

	public void setNumeroDaConta(int numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	public Pessoa getCorrentista() {
		return correntista;
	}

	public void setCorrentista(Pessoa correntista) {
		this.correntista = correntista;
	}
	
	public boolean deposito(double valor) {
		if(valor > 0) {
			saldo = saldo + valor;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean saque(double valor) {
		if(valor > 0 && saldo > valor) {
			saldo = saldo - valor;
			return true;
		}else {
			return false;
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaBancaria [agencia=");
		builder.append(agencia);
		builder.append(", numeroDaConta=");
		builder.append(numeroDaConta);
		builder.append(", saldo=");
		builder.append(saldo);
		builder.append(", banco=");
		builder.append(banco);
		builder.append(", correntista=");
		builder.append(correntista);
		builder.append("]");
		return builder.toString();
	}
	
}
