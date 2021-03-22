package Exercicio04;

public class PlacaMae {

	private String marca = "";
	private String modelo = "";
	protected HD hd;
	protected Memoria memoria;
	protected Processador processador;
	
	public PlacaMae() {
		hd = new HD();
		memoria = new Memoria();
		processador = new Processador();
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public HD getHd() {
		return hd;
	}

	public void setHd(HD hd) {
		this.hd = hd;
	}

	public Memoria getMemoria() {
		return memoria;
	}

	public void setMemoria(Memoria memoria) {
		this.memoria = memoria;
	}

	public Processador getProcessador() {
		return processador;
	}

	public void setProcessador(Processador processador) {
		this.processador = processador;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PlacaMae [marca=");
		builder.append(marca);
		builder.append(", modelo=");
		builder.append(modelo);
		builder.append(", hd=");
		builder.append(hd);
		builder.append(", memoria=");
		builder.append(memoria);
		builder.append(", processador=");
		builder.append(processador);
		builder.append("]");
		return builder.toString();
	}	
}
