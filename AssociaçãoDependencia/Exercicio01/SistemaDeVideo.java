package Exercicio01;

public class SistemaDeVideo extends EquipamentoEletronico {

	private String tipo = "";
	private String resolu��o = "";
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getResolu��o() {
		return resolu��o;
	}
	public void setResolu��o(String resolu��o) {
		this.resolu��o = resolu��o;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SistemaDeVideo [tipo=");
		builder.append(tipo);
		builder.append(", resolu��o=");
		builder.append(resolu��o);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
}
