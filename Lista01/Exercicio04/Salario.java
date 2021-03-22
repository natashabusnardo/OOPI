package Exercicio04;

public class Salario {

	private float valorPHora = 0;
	private int qtdHoras = 0;

	public float getValorPHora() {
		return valorPHora;
	}

	public void setValorPHora(float valorPHora) {
		if (valorPHora > 0)
			this.valorPHora = valorPHora;
	}

	public int getQtdHoras() {
		return qtdHoras;
	}

	public void setQtdHoras(int qtdHoras) {
		if (qtdHoras > 0)
			this.qtdHoras = qtdHoras;
	}

	public void salarioLiquido() {
		float salarioBruto = valorPHora * qtdHoras;
		float inss = salarioBruto * (float) 0.08;
		float sindicato = salarioBruto * (float) 0.05;
		float ir = salarioBruto * (float) 0.11;
		float sal = salarioBruto - (inss + sindicato + ir);
		System.out.println(
				"+ Salario Bruto: R$ " + salarioBruto + " \nDescontos: \n- INSS: R$ " + inss + " \n- Sindicato: R$"
						+ " " + sindicato + " \n- Imposto de Renda: R$ " + ir + " \n= Salário Líquido: R$ " + sal);

	}
}
