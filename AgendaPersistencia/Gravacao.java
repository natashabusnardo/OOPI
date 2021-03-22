import java.text.ParseException;
import java.util.List;

public interface Gravacao {
	
	public boolean gravar(List<Contato> list);
	public List<Contato> ler() throws ParseException;

}