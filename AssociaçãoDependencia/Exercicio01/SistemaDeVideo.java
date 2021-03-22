package Exercicio01;

public class SistemaDeVideo extends EquipamentoEletronico {

	private String tipo = "";
	private String resolução = "";
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getResolução() {
		return resolução;
	}
	public void setResolução(String resolução) {
		this.resolução = resolução;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SistemaDeVideo [tipo=");
		builder.append(tipo);
		builder.append(", resolução=");
		builder.append(resolução);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
}
