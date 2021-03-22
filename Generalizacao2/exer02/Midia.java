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
		builder.append(", Duração: ");
		builder.append(duracao);
		builder.append(", Código: ");
		builder.append(getCodigo());
		builder.append(", Descrição: ");
		builder.append(getDescricao());
		builder.append("]");
		return builder.toString();
	}


	
	
}	
