import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class JSON implements Gravacao {

	public List<Contato> ler() throws ParseException{
		List<Contato> lista = new ArrayList<Contato>();
		Contato p = new Contato();
		try {
			GsonBuilder builder = new GsonBuilder();
			Gson gson = builder.create();
			BufferedReader bufferedReader = new BufferedReader(new FileReader("agenda.json"));
			String linha = bufferedReader.readLine();
			lista = new ArrayList<Contato>();
			while (linha != null) {
				String[] leitura = linha.split(";");
				p = new Contato();
				p.setCodigo(Integer.parseInt(leitura[0]));
				p.setNome(leitura[1]);
				p.setEmail(leitura[2]);
				p.setDataNasc(leitura[3]);
				lista.add(p);
				linha = bufferedReader.readLine();
			}
			bufferedReader.close();
			return lista;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	public boolean gravar(List<Contato> list) {
		ListaContatos lista = new ListaContatos();
		lista.setLista(list);
		try {
			GsonBuilder builder = new GsonBuilder();

			Gson gson = builder.create();

			FileWriter writer = new FileWriter("persistencia/agenda.json", true);

			writer.write(gson.toJson(lista,ListaContatos.class));

			writer.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		} 
		return true;
	}
}