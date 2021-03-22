package exer01;

public class PessoaJuridica extends Pessoa{

	private String cnpj;
	private String tipoEmpresa;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getTipoEmpresa() {
		return tipoEmpresa;
	}

	public void setTipoEmpresa(String tipoEmpresa) {
		this.tipoEmpresa = tipoEmpresa;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa Júridica: Nome: ");
		builder.append(getNome());
		builder.append(", Endereco: ");
		builder.append(getEndereco());
		builder.append(", CNPJ: ");
		builder.append(cnpj);
		builder.append(", Tipo da Empresa: ");
		builder.append(tipoEmpresa);
		builder.append("]");
		builder.append(getNome());
		return builder.toString();
	}

	
}
