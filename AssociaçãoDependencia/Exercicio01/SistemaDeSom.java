package Exercicio01;

public class SistemaDeSom extends EquipamentoEletronico {

	
	private String potencia = "";
	
	public String getPotencia() {
		return potencia;
	}
	public void setPotencia(String potencia) {
		this.potencia = potencia;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SistemaDeSom [potencia=");
		builder.append(potencia);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}	
}
