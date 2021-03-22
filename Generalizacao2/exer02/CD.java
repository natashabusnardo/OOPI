package exer02;

public class CD extends Midia {
	private int faixas;
	private String artista;
	private String album;

	public int getFaixas() {
		return faixas;
	}

	public void setFaixas(int faixas) {
		this.faixas = faixas;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CD:  Faixas: ");
		builder.append(faixas);
		builder.append(" Artista: ");
		builder.append(artista);
		builder.append(" Álbum: ");
		builder.append(album);
		builder.append("]");
		builder.append(super.toString());
		return builder.toString();
	}

}
