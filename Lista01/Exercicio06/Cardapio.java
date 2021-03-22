package Exercicio06;

public class Cardapio {

	private int codigo;
	private float qtd;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		if (codigo >= 100 && codigo <= 105)
			this.codigo = codigo;
	}

	public float getQtd() {
		return qtd;
	}

	public void setQtd(float qtd) {
		if (qtd > 0)
			this.qtd = qtd;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cardapio [codigo=");
		builder.append(codigo);
		builder.append(", qtd=");
		builder.append(qtd);
		builder.append("]");
		return builder.toString();
	}
}
