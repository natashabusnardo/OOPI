package exer02;

public class Midia extends Item {
	private String gravadora;
	private float duracao;

	public String getGravadora() {
		return gravadora;
	}

	public void setGravadora(String gravadora) {
		this.gravadora = gravadora;
	}

	public float getDuracao() {
		return duracao;
	}

	public void setDuracao(float duracao) {
		this.duracao = duracao;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Midia: Gravadora:");
		builder.append(gravadora);
		builder.append(", Dura��o: ");
		builder.append(duracao);
		builder.append(", C�digo: ");
		builder.append(getCodigo());
		builder.append(", Descri��o: ");
		builder.append(getDescricao());
		builder.append("]");
		return builder.toString();
	}


	
	
}	
