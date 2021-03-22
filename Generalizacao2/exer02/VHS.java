package exer02;

public class VHS extends Midia {
	private String titulo;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("VHS:  Título=");
		builder.append(titulo);
		builder.append(", Gravadora: ");
		builder.append(getGravadora());
		builder.append(", Duração: ");
		builder.append(getDuracao());
		builder.append(", Código: ");
		builder.append(getCodigo());
		builder.append(", Descrição: ");
		builder.append(getDescricao());
		builder.append("]");
		return builder.toString();
	}


}
