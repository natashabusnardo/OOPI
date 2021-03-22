package pizzaria;

public class Massa {
	private int codigo;
	private String sabor;

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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Massa [codigo=");
		builder.append(codigo);
		builder.append(", sabor=");
		builder.append(sabor);
		builder.append("]");
		return builder.toString();
	}

}
