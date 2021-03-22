package Exercicio01;

public class EquipamentoEletronico {

	private String marca = "";
	private String modelo = "";
	private float tensao = 0;
	private float consumo = 0;
	
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
	public float getTensao() {
		return tensao;
	}
	public void setTensao(float tensao) {
		if (tensao > 0) {
		this.tensao = tensao;
	}}
	public float getConsumo() {
		return consumo;
	}
	public void setConsumo(float consumo) {
		if (consumo > 0) {
		this.consumo = consumo;
	}}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EquipamentoEletronico [marca=");
		builder.append(marca);
		builder.append(", modelo=");
		builder.append(modelo);
		builder.append(", tensao=");
		builder.append(tensao);
		builder.append(", consumo=");
		builder.append(consumo);
		builder.append("]");
		return builder.toString();
	}
}
