package exer03;

public class ContaEspecial extends Conta {
	private int diasSemJuros;
	private double limite;

	public int getDiasSemJuros() {
		return diasSemJuros;
	}

	public void setDiasSemJuros(int diasSemJuros) {
		this.diasSemJuros = diasSemJuros;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Conta Especial: Dias sem juros: ");
		builder.append(diasSemJuros);
		builder.append(", Limite");
		builder.append(limite);
		builder.append(", Nome do Banco ");
		builder.append(getBanco());
		builder.append(", Número da Agência ");
		builder.append(getAgencia());
		builder.append(", Número da Conta ");
		builder.append(getNumeroconta());
		builder.append(", Saldo da Conta ");
		builder.append(getSaldo());
		builder.append("]");
		return builder.toString();
	}

}
