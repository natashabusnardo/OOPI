import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Pessoa {

	private String cpf;
	private String nome;
	private Date dataNasc;


	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		if (cpf.length() > 0)
			this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome.length() > 0)
			this.nome = nome;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		try {
			this.dataNasc = new SimpleDateFormat("dd/MM/yyyy").parse(dataNasc);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [cpf=");
		builder.append(cpf);
		builder.append(", nome=");
		builder.append(nome);
		builder.append(", dataNasc=");
		builder.append(dataNasc);
		builder.append("]");
		return builder.toString();
	}

}
