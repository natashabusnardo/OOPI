package pizzaria;

import java.text.ParseException;
import java.util.List;

public interface Gravacao {

	public boolean gravar(List<Pedido> list);

	public List<Pedido> ler() throws ParseException;

}