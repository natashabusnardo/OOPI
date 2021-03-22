package pizzaria;

import java.io.IOException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ListaPedidos {
	List<Pedido> lista = new ArrayList<Pedido>();

	public List<Pedido> getLista() {
		return lista;
	}

	public void setLista(List<Pedido> lista) {
		this.lista = lista;
	}

	public void inserir(Pedido p) throws IOException {
		lista.add(p);
	}

	public void excluir(int cod) throws IOException {
		for (Pedido Contato : lista) {
			if (Contato.getCodigo() == cod) {
				lista.remove(Contato);
			}
		}
	}

	public void alterar(Pedido p, int cod) throws IOException {
		for (Pedido Contato : lista) {
			if (p.equals(Contato)) {
				p.setCodigo(p.getCodigo());
				p.setData(p.getData());
				p.setFormaPagamento(p.getFormaPagamento());
				p.setTipoEntrega(p.getFormaPagamento());
				p.setStatusPedido(p.getStatusPedido());
			}
		}
	}
	public static String retornaData(Date data) {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String dataString = format.format(data);
		return dataString;
	}

	public static Date retornaData(String data) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date dataDate = format.parse(data);
		return dataDate;
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
