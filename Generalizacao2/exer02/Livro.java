package exer02;

public class Livro extends Item {
	private String autor;

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Livro:  Autor: ");
		builder.append(autor);
		builder.append(", Código: ");
		builder.append(getCodigo());
		builder.append(", Descrição: ");
		builder.append(getDescricao());
		builder.append("]");
		return builder.toString();
	}



	

}
