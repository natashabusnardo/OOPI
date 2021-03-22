import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class GravarCSV implements Gravacao {

	public List<Contato> ler() throws ParseException{
		List <Contato> lista = new ArrayList <Contato>();
		try {
	    	Contato p = new Contato();
			FileReader arq1 = new FileReader("agenda.csv");
	    	BufferedReader lerArq = new BufferedReader(arq1);
	    	String linha = lerArq.readLine();
	    	
	    	while (linha != null) {
	    		String[] leitura = linha.split(";");
	    		p = new Contato();
	    		p.setCodigo(Integer.parseInt(leitura[0]));
	    		p.setNome(leitura[1]);
	    		p.setEmail(leitura[2]);
	    		p.setTelefone(leitura[3]);
	    		p.setDataNasc(ListaContatos.retornaDate(leitura[4]));
	    		lista.add(p);
	    		linha = lerArq.readLine();
	    	}
	    	
	    	arq1.close();
	    	return lista;
	    } catch(IOException e) {
	    	System.err.printf("Erro na Abertura do Arquivo: %s. \n", e.getMessage());
	    	return null;
	    }
	}
	
	public boolean gravar(List<Contato> lista){
		try {
			FileWriter arq = new FileWriter("agenda.csv");
			PrintWriter gravarArq = new PrintWriter(arq);
			for (Contato Contato : lista) {
				gravarArq.printf("%d;%s;%s;%s;%s\n", Contato.getCodigo(),Contato.getNome(),Contato.getEmail(),Contato.getTelefone(), ListaContatos.retornaData(Contato.getDataNasc()));
			}
			arq.close();
			return true;
			}catch (IOException e) {
				return false;
			}
	}
}