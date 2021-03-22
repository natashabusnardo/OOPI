package pizzaria;

public class Borda {
	private int codigo;
	private String sabor;
	private String classificacao;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public String getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Borda [codigo=");
		builder.append(codigo);
		builder.append(", sabor=");
		builder.append(sabor);
		builder.append(", classificacao=");
		builder.append(classificacao);
		builder.append("]");
		return builder.toString();
	}

}
