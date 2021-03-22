import java.util.Date;

public class Atendimento {
	private Paciente paciente;
	private Medico medico;
	private Date horarioAtendimento;

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public Date getHorarioAtendimento() {
		return horarioAtendimento;
	}

	public void setHorarioAtendimento(Date horarioAtendimento) {
		this.horarioAtendimento = horarioAtendimento;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Atendimento:  Paciente ");
		builder.append(paciente.getNome());
		builder.append(" M�dico ");
		builder.append(medico.getNome());
		builder.append(", Especializa��o: ");
		builder.append(medico.getEspecializacao());
		builder.append(", Hor�rio chegada: ");
		builder.append(paciente.getHoraChegada());
		builder.append(", Hor�rio atendimento: ");
		builder.append(horarioAtendimento);
		builder.append("]");
		return builder.toString();
	}

}
