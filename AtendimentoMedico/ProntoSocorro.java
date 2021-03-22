import java.util.ArrayList;
import java.util.List;

public class ProntoSocorro {
	protected List<Paciente> pacientes;
	protected List<Medico> medicos;
	protected List<Atendimento> atendimentos;

	StringBuilder builder = new StringBuilder();

	private Paciente inicio;
	private Paciente fim;
	private Paciente aux;

	public boolean addPaciente(Paciente paciente) {

		if (inicio == null) {
			inicio = paciente;
			fim = paciente;
			paciente.setProximo(null);
		} else {
			aux = inicio;
			while (aux != null) {
				if (aux == inicio && paciente.getGravidade() > aux.getGravidade()) {
					paciente.setProximo(aux);
					inicio = paciente;
					aux = null;

				} else {
					if (aux.getProximo() == null || aux.getProximo().getGravidade() < paciente.getGravidade()) {
						paciente.setProximo(aux.getProximo());
						aux.setProximo(paciente);
						aux = null;
					} else {
						aux = aux.getProximo();
					}
				}
			}
		}
		return pacientes.add(paciente);

	}

	public boolean addMedico(Medico medico) {
		return medicos.add(medico);
	}

	public boolean addAtendimento(Atendimento atendimento) {
		return atendimentos.add(atendimento);
	}

	public Medico selecionar(String nome) {
		for (Medico medico : medicos) {
			if (nome.equals(medico.getNome())) {
				return medico;
			}
		}

		return null;
	}

	public ProntoSocorro() {
		pacientes = new ArrayList<>();
		medicos = new ArrayList<>();
		atendimentos = new ArrayList<>();
	}

	public String verFila() {

		String verFilaSTR = " ";
		if (pacientes.isEmpty()) {
			verFilaSTR += "Sem pacientes na fila.";

		} else {
			verFilaSTR += "Pacientes na fila: ";
			aux = inicio;
			while (aux != null) {
				verFilaSTR += aux.getNome() + " ";
				aux = aux.getProximo();
			}

		}
		return verFilaSTR;
	}

	public Paciente remover() {
		if (inicio == null) {
			return null;
		} else {
			aux = inicio;
			inicio = inicio.getProximo();
			return aux;
		}
	}

	public String verAtendimentos() {
		
		String verAtendimentosSTR = "";
		verAtendimentosSTR += "Atendimentos registrados: ";
		for (Atendimento atendimento : atendimentos) {
			verAtendimentosSTR += atendimento.toString() ;
		}
		return verAtendimentosSTR;
	}

}
