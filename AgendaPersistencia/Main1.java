import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class Main1 {

	public static void main(String[] args) throws FileNotFoundException, ParseException { 
		List<Contato> Contato = new ArrayList<Contato>();
		GravarCSV csv = new GravarCSV();
		//JSON json = new JSON();
		//XML xml = new XML();
		Persistencia pers = new Persistencia(csv);
		 Contato = (ArrayList<Contato>)pers.ler();
		 
		 System.out.println(Contato);
	}

}