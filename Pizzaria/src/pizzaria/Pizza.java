package pizzaria;

import java.util.List;

public class Pizza extends Produto {
	private String tamanho;
	private List<Borda> listaBordas;
	private List<Recheio> listaRecheios;
	private Massa massa;

	public List<Borda> getListaBordas() {
		return listaBordas;
	}

	public void setListaBordas(List<Borda> listaBordas) {
		this.listaBordas = listaBordas;
	}

	public List<Recheio> getListaRecheios() {
		return listaRecheios;
	}

	public void setListaRecheios(List<Recheio> listaRecheios) {
		this.listaRecheios = listaRecheios;
	}

	public Massa getMassa() {
		return massa;
	}

	public void setMassa(Massa massa) {
		this.massa = massa;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pizza [tamanho=");
		builder.append(tamanho);
		builder.append("]");
		return builder.toString();
	}

}
