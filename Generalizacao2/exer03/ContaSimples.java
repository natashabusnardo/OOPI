package exer03;

public class ContaSimples extends Conta {
	private double saldoPoupanca;

	public double getSaldoPoupanca() {
		return saldoPoupanca;
	}

	public void setSaldoPoupanca(double saldoPoupanca) {
		this.saldoPoupanca = saldoPoupanca;
	}

	public boolean depositoPoupanca(double valor) {
		if (valor > 0) {
			saldoPoupanca = saldoPoupanca + valor;
			return true;
		} else {
			return false;
		}

	}

	public boolean saquePoupanca(double valor) {
		if (saldoPoupanca > 0 && saldoPoupanca > valor) {
			saldoPoupanca = saldoPoupanca - valor;
			return true;
		} else {
			return false;
		}

	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaSimples: Saldo da Poupança");
		builder.append(saldoPoupanca);
		builder.append(", Nome do Banco ");
		builder.append(getBanco());
		builder.append(", Número da agência ");
		builder.append(getAgencia());
		builder.append(", Número da conta ");
		builder.append(getNumeroconta());
		builder.append(", Saldo da conta ");
		builder.append(getSaldo());
		builder.append("]");
		return builder.toString();
	}

}
