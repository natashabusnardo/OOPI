import java.util.List;

public class Persistencia {
	
	private Gravacao g;
	
	public Persistencia(Gravacao g) {
		this.g = g;
	}
	
	public boolean gravar(List<Contato> list) {
		return g.gravar(list);
		
	}
	public List<Contato> ler(){
		return g.ler();
	}

	
}