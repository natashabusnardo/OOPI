import java.util.Date;

public class Paciente extends Pessoa {
	private int telefone;
	private int gravidade;
	private String endereco;
	private Paciente proximo;
	private Date horaChegada;

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public int getGravidade() {
		return gravidade;
	}

	public void setGravidade(int gravidade) {
		this.gravidade = gravidade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Paciente getProximo() {
		return proximo;
	}

	public void setProximo(Paciente proximo) {
		this.proximo = proximo;
	}

	public Date getHoraChegada() {
		return horaChegada;
	}

	public void setHoraChegada(Date horaChegada) {
		this.horaChegada = horaChegada;
	}
	
	public Paciente (String nome, String cpf, String dataNasc, int telefone, int gravidade, String endereco, Date horaChegada) {
		setNome(nome);
		setCpf(cpf);
		setDataNasc(dataNasc);
		setTelefone(telefone);
		setGravidade(gravidade);
		setEndereco(endereco);
		setHoraChegada(horaChegada);
	}
	public Paciente() {
		
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Paciente:  Nome: ");
		builder.append(getNome());
		builder.append(", CPF: ");
		builder.append(getCpf());
		builder.append(", Data de Nascimento: ");
		builder.append(getDataNasc());
		builder.append(", Telefone ");
		builder.append(telefone);
		builder.append(", Gravidade ");
		builder.append(gravidade);
		builder.append(", Endereco ");
		builder.append(endereco);
		builder.append(", Proximo ");
		builder.append(proximo);
		builder.append(", Hora de chegada ");
		builder.append(horaChegada);
		builder.append("]");
		return builder.toString();
	}

}
