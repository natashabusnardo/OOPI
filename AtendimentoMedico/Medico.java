import java.util.Date;

public class Medico extends Pessoa {
	private String crm;
	private String especializacao;
	private boolean disponivel;

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		if (crm.length() > 0)
			this.crm = crm;
	}

	public String getEspecializacao() {
		return especializacao;
	}

	public void setEspecializacao(String especializacao) {
		this.especializacao = especializacao;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	
	public Medico (String nome, String cpf, String dataNasc, String crm, String especializacao, boolean disponivel) {
		setNome(nome);
		setCpf(cpf);
		setDataNasc(dataNasc);
		setCrm(crm);
		setEspecializacao(especializacao);
		setDisponivel(disponivel);
	}
	public Medico() {
		
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Medico:  Nome: ");
		builder.append(getNome());
		builder.append(", CPF: ");
		builder.append(getCpf());
		builder.append(", Data de Nascimento: ");
		builder.append(getDataNasc());
		builder.append(", CRM ");
		builder.append(crm);
		builder.append(", Especializacao ");
		builder.append(especializacao);
		builder.append(", Disponivel ");
		builder.append(disponivel);
		builder.append("]");
		return builder.toString();
	}

}
