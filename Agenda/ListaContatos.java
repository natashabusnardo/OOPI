import java.util.ArrayList;
import java.util.List;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ListaContatos  {
	 List<Contato> lista = new ArrayList<Contato>();
	
	 public List<Contato> getLista() {
		return lista;
	}

	public void setLista(List<Contato> lista) {
		this.lista = lista;
	}

	public void inserir(Contato p)throws IOException {
		lista.add(p);
	}
	
	public void excluir(int cod) throws IOException{
		for (Contato Contato : lista) {
			if (Contato.getCodigo() == cod) {
				lista.remove(Contato);
			}
		}
	}
	
	public void alterar(Contato p, Contato p1) throws IOException {
		for (Contato Contato : lista) {
			if (p.equals(Contato)) {
				p.setCodigo(p1.getCodigo());
				p.setNome(p1.getNome());
				p.setEmail(p1.getEmail());
				p.setTelefone(p1.getTelefone());
				p.setDataNasc(p1.getDataNasc());
			}
		}
	}
	
	public static String retornaData(Date data) {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		String dataString = format.format(data);
		return dataString;
	}
	
	public static Date retornaDate(String data) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		Date dataDate = format.parse(data);
		return dataDate;
	}
	
	public List<Contato> nome(String nome){
		List<Contato> retornaNome = new ArrayList<Contato>(); 
		for (Contato Contato : lista) {
			String aux = Contato.getNome().toLowerCase();
		    	if (aux.substring(0,1).contains(nome.toLowerCase())) {
		    		retornaNome.add(Contato);
		    	}
		    }
		return retornaNome;
	}
	
	public List<Contato> email(String email){
		List<Contato> retornaEmail = new ArrayList<Contato>();
		 for (Contato Contato : lista) {
		    	if (Contato.getEmail().toLowerCase().contains(email.toLowerCase())) {
		    		retornaEmail.add(Contato);
		    	}
		    }
		return retornaEmail;
	}
	
	@SuppressWarnings("deprecation")
	public List<Contato> aniversario(int mes){
		List<Contato> retornaAniver = new ArrayList<Contato>();
		 for (Contato Contato : lista) {
		    	if (Contato.getDataNasc().getMonth() == mes) {
		    		retornaAniver.add(Contato);
		    	}
		    }
		return retornaAniver;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ListaContato [lista=");
		builder.append(lista);
		builder.append("]");
		return builder.toString();
	}
	
}
