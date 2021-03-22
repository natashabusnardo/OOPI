package pizzaria;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GravarJson implements Gravacao {

	public List<Pedido> ler() throws ParseException {
		List<Pedido> lista = new ArrayList<Pedido>();
		Pedido p = new Pedido();
		try {
			GsonBuilder builder = new GsonBuilder();
			Gson gson = builder.create();
			BufferedReader bufferedReader = new BufferedReader(new FileReader("pedidos.json"));
			String linha = bufferedReader.readLine();
			lista = new ArrayList<Pedido>();
			while (linha != null) {
				String[] leitura = linha.split(";");
				p = new Pedido();
				p.setCodigo(Integer.parseInt(leitura[0]));
				p.setData(ListaPedidos.retornaData(leitura[1]));
				p.setFormaPagamento(leitura[2]);
				p.setTipoEntrega(leitura[3]);
				p.setStatusPedido(Enum.valueOf(null, leitura[4]));
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

	public boolean gravar(List<Pedido> list) {
		ListaPedidos lista = new ListaPedidos();
		lista.setLista(list);
		try {
			GsonBuilder builder = new GsonBuilder();

			Gson gson = builder.create();

			FileWriter writer = new FileWriter("pedidos.json", true);

			writer.write(gson.toJson(lista, ListaPedidos.class));

			writer.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return true;
	}
}