package pizzaria;


public class Bebida extends Produto {
	private boolean alcoolica;

	public Bebida(int codigo, String descricao, double preco, boolean alcoolica) {
		// TODO Auto-generated constructor stub
		setCodigo(codigo);
		setDescricao(descricao);
		setPreco(preco);
		setAlcoolica(alcoolica);
	}
	
	public Bebida() {
		
	}
	public boolean isAlcoolica() {
		return alcoolica;
	}

	public void setAlcoolica(boolean alcoolica) {
		this.alcoolica = alcoolica;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Bebida [alcoolica=");
		builder.append(alcoolica);
		builder.append("]");
		return builder.toString();
	}

}
