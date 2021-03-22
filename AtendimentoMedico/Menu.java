import java.util.Date;
import java.util.Scanner;

public class Menu {
	Scanner entrada = new Scanner(System.in);
	private ProntoSocorro prontoSocorro;

	public Menu() {
		prontoSocorro = new ProntoSocorro();
		Date horaAtual = new Date();
		Paciente p1 = new Paciente("Natasha", "111111111" , "12/01/2000" , 9999999, 4, "Rua pipopopo", horaAtual);
		Paciente p2 = new Paciente("João", "22222222" , "13/08/2000" , 9999999, 3, "Rua pipopopo", horaAtual);
		Paciente p3 = new Paciente("Rubens", "111111" , "22/01/1998" , 9999999, 1, "Rua pipopopo", horaAtual);
		Paciente p4 = new Paciente("Samanta", "111111" , "20/03/2000" , 9999999, 2, "Rua pipopopo", horaAtual);
		Paciente p5 = new Paciente("Fernando", "111111" , "31/03/2000" , 9999999, 1, "Rua pipopopo", horaAtual);
		Paciente p6 = new Paciente("José", "111111" , "10/04/2000" , 9999999, 1, "Rua pipopopo", horaAtual);
		Paciente p7 = new Paciente("Fernando", "111111" , "05/07/2000" , 9999999, 2, "Rua pipopopo", horaAtual);
		Paciente p8 = new Paciente("Maria", "111111" , "14/07/2000" , 9999999, 1, "Rua pipopopo", horaAtual);
		Paciente p9 = new Paciente("Maiara", "111111" , "04/09/2000" , 9999999, 1, "Rua pipopopo", horaAtual);
		Paciente p10 = new Paciente("Gabriela", "111111" , "18/03/2000" , 9999999, 4, "Rua pipopopo", horaAtual);
		Paciente p11 = new Paciente("Vitor", "111111" , "01/12/1964" , 9999999, 1, "Rua pipopopo", horaAtual);
		Paciente p12 = new Paciente("Deivid", "111111" , "15/11/1975" , 9999999, 4, "Rua pipopopo", horaAtual);
		Paciente p13 = new Paciente("Eliane", "111111" , "19/10/1995" , 9999999, 1, "Rua pipopopo", horaAtual);
		Paciente p14 = new Paciente("Osnir", "111111" , "04/09/1996" , 9999999, 1, "Rua pipopopo", horaAtual);
		Paciente p15 = new Paciente("Henrique", "111111" , "07/07/1998" , 9999999, 3, "Rua pipopopo", horaAtual);
		Paciente p16 = new Paciente("Nathalie", "111111" , "09/06/2000" , 9999999, 2, "Rua pipopopo", horaAtual);
		Paciente p17 = new Paciente("Juliano", "111111" , "12/02/1974" , 9999999, 1, "Rua pipopopo", horaAtual);
		Paciente p18 = new Paciente("Lucas", "111111" , "05/04/1978" , 9999999, 4, "Rua pipopopo", horaAtual);
		Paciente p19 = new Paciente("Thais", "111111" , "01/05/1988" , 9999999, 3, "Rua pipopopo", horaAtual);
		Paciente p20 = new Paciente("Junior", "111111" , "12/03/1999" , 9999999, 1, "Rua pipopopo", horaAtual);
		
		Medico m1 = new Medico("Ana", "111111" , "15/03/2000" , "9999999", "Cardiologista", true);
		Medico m2 = new Medico("Manuel", "111111" , "05/04/1978" , "9999999", "Clínico Geral", true);
		
		prontoSocorro.addPaciente(p1);
		prontoSocorro.addPaciente(p2);
		prontoSocorro.addPaciente(p3);
		prontoSocorro.addPaciente(p4);
		prontoSocorro.addPaciente(p5);
		prontoSocorro.addPaciente(p6);
		prontoSocorro.addPaciente(p7);
		prontoSocorro.addPaciente(p8);
		prontoSocorro.addPaciente(p9);
		prontoSocorro.addPaciente(p10);
		prontoSocorro.addPaciente(p11);
		prontoSocorro.addPaciente(p12);
		prontoSocorro.addPaciente(p13);
		prontoSocorro.addPaciente(p14);
		prontoSocorro.addPaciente(p15);
		prontoSocorro.addPaciente(p16);
		prontoSocorro.addPaciente(p17);
		prontoSocorro.addPaciente(p18);
		prontoSocorro.addPaciente(p19);
		prontoSocorro.addPaciente(p20);
		
		prontoSocorro.addMedico(m1);
		prontoSocorro.addMedico(m2);
		
	}

	public int buildMainMenu() {
		
		int opcao;

		StringBuilder builder = new StringBuilder();

		builder.append("\n ----------Atendimento Médico------------");
		builder.append("\n1 - Fila de atendimento");
		builder.append("\n2 - Realizar atendimento");
		builder.append("\n3 - Adicionar paciente");
		builder.append("\n4 - Adicionar médico");
		builder.append("\n5 - Listar todos os atendimentos ");
		builder.append("\n6 - Finalizar atendimento");
		builder.append("\n8 - Sair");

		System.out.println(builder.toString());

		opcao = entrada.nextInt();
		entrada.nextLine();

		return opcao;
	}

	public void addPaciente() {

		Paciente paciente = new Paciente();

		int gravidade = 0;

		System.out.println("Insira o nome do paciente: ");
		paciente.setNome(entrada.next());

		System.out.println("Insira o CPF: ");
		paciente.setCpf(entrada.next());

		System.out.println("Insira a data de nascimento: ");
		paciente.setDataNasc(entrada.next());

		System.out.println("Insira o telefone: ");
		paciente.setTelefone(entrada.nextInt());

		System.out.println("Insira o endereço: ");
		paciente.setEndereco(entrada.next());

		System.out.println("Gravidade do atendimento: Responda as perguntas com S para sim ou N para não. ");

		System.out.println("Temperatura corporal do paciente está abaixo de 36 graus ou acima de 37 graus?");
		char resposta = entrada.next().charAt(0);
		if (resposta == 'S')
			gravidade += 1;

		System.out.println("Paciente está com aritmia cardíaca?");
		resposta = entrada.next().charAt(0);
		if (resposta == 'S')
			gravidade += 1;

		System.out.println("Paciente está ofegante ou com hiperventilação?");
		resposta = entrada.next().charAt(0);
		if (resposta == 'S')
			gravidade += 1;

		System.out.println("Paciente está com pressão arterial normal?");
		resposta = entrada.next().charAt(0);
		if (resposta == 'N')
			gravidade += 1;

		paciente.setGravidade(gravidade);

		Date dataHoraAtual = new Date();

		paciente.setHoraChegada(dataHoraAtual);

		prontoSocorro.addPaciente(paciente);
		System.out.println(paciente.toString());
	}

	public void addAtendimento() {
		String nomeMedico = " ";

		Atendimento atendimento = new Atendimento();

		System.out.println("Insira o nome do médico responsável pelo atendimento: ");
		nomeMedico = entrada.nextLine();

		Medico medico = prontoSocorro.selecionar(nomeMedico);

		if (medico != null) {
			if (!medico.isDisponivel()) {
				System.out.println("O médico" + medico.getNome() + "não está disponível no momento.");
			} else {
				Paciente paciente = prontoSocorro.remover();
				if (paciente != null) {
					System.out.println(paciente.getNome() + " saiu da fila e será atendido.");
					medico.setDisponivel(false);
					atendimento.setMedico(medico);
					atendimento.setPaciente(paciente);
					Date dataHoraAtual = new Date();
					atendimento.setHorarioAtendimento(dataHoraAtual);
					prontoSocorro.addAtendimento(atendimento);

				} else {
					System.out.println("Não existem pacientes na fila.");
				}
			}
		} else {
			System.out.println("O médico " + nomeMedico + " não está cadastrado no sistema.");
		}

	}

	public void addMedico() {

		Medico medico = new Medico();

		System.out.println("Insira o nome do médico: ");
		medico.setNome(entrada.next());

		System.out.println("Insira o CPF: ");
		medico.setCpf(entrada.next());

		System.out.println("Insira a data de nascimento: ");
		medico.setDataNasc(entrada.next());

		System.out.println("Insira o CRM: ");
		medico.setCrm(entrada.next());

		System.out.println("Insira a especialização: ");
		medico.setEspecializacao(entrada.next());

		medico.setDisponivel(true);

		prontoSocorro.addMedico(medico);
		System.out.println(medico.toString());
	}

	public void selecionarOpcao(int opcao) {
		
		


		switch (opcao) {
		case 1:
			System.out.println(prontoSocorro.verFila());
			break;

		case 2:
			addAtendimento();
			break;

		case 3:
			addPaciente();
			break;

		case 4:
			addMedico();
			break;

		case 5:
			System.out.println(prontoSocorro.verAtendimentos());
			break;

		case 6:
			System.out.println("Informe o nome do médico que está realizando o atendimento que será finalizado: ");
			String nome = entrada.nextLine();

			Medico medico = prontoSocorro.selecionar(nome);

			if (medico == null) {
				System.out.println("O médico não existe.");
			} else {
				medico.setDisponivel(true);
			}
			break;

		case 7:
			System.out.println("Obrigada. Volte Sempre!");
			break;

		default:
			System.out.println("Opção inválida. Tente novamente.");
			break;
		}

	}
}
