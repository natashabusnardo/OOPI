package Exercicio11;

public class BombaCombustivel {

	private String tipoCombustivel = "";
	private float valorLitro = 0;
	private float quantidadeCombustivel = 0;

	public String getTipoCombustivel() {
		return tipoCombustivel;
	}

	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}

	public float getValorLitro() {
		return valorLitro;
	}

	public void setValorLitro(float valorLitro) {
		this.valorLitro = valorLitro;
	}

	public float getQuantidadeCombustivel() {
		return quantidadeCombustivel;
	}

	public void setQuantidadeCombustivel(float quantidadeCombustivel) {
		this.quantidadeCombustivel = quantidadeCombustivel;
	}
	
	public float abastecerPorValor(float valorParaAbastecer) {
		float quantidadeLitros = valorParaAbastecer / valorLitro;
		if(quantidadeCombustivel >= quantidadeLitros) {
			quantidadeCombustivel = quantidadeCombustivel - quantidadeLitros;
			return quantidadeLitros;
		}else {
			return 0;
		}
	}
	
	public float abastecerPorLitro(float quantidadeLitros) {
		if(quantidadeCombustivel >= quantidadeLitros) {
			quantidadeCombustivel = quantidadeCombustivel - quantidadeLitros;
			float valor = quantidadeLitros * valorLitro;
			return valor;
		}else {
			return 0;
		}
	}
	
	public void alterarValor(float valorLitro) {
		this.valorLitro = valorLitro;
	}
	
	public void alterarCombustivel(String tipoCombustivel){
		this.tipoCombustivel = tipoCombustivel;
	}
	
	public void alterarQuantidadeCombustivel(float quantidadeCombustivel) {
		this.quantidadeCombustivel = quantidadeCombustivel;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BombaCombustivel [tipoCombustivel=");
		builder.append(tipoCombustivel);
		builder.append(", valorLitro=");
		builder.append(valorLitro);
		builder.append(", quantidadeCombustivel=");
		builder.append(quantidadeCombustivel);
		builder.append("]");
		return builder.toString();
	}

}
