package exer01;

public class PessoaFisica extends Pessoa {
	private String cpf;
	private String estadoCivil;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa Física:  Nome: ");
		builder.append(getNome());
		builder.append(", Endereco: ");
		builder.append(getEndereco());
		builder.append(", CPF: ");
		builder.append(cpf);
		builder.append(", Estado Civil: ");
		builder.append(estadoCivil);
		builder.append("]");
		
		return builder.toString();
	}
	
	
}
