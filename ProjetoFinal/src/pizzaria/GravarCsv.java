package pizzaria;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class GravarCsv implements Gravacao {

	public List<Pedido> ler() throws ParseException {
		List<Pedido> lista = new ArrayList<Pedido>();
		try {
			Pedido p = new Pedido();
			FileReader arq1 = new FileReader("pedidos.csv");
			BufferedReader lerArq = new BufferedReader(arq1);
			String linha = lerArq.readLine();

			while (linha != null) {
				String[] leitura = linha.split(",");
				p = new Pedido();
				p.setCodigo(Integer.parseInt(leitura[0]));
				p.setData(ListaPedidos.retornaData(leitura[1]));
				p.setFormaPagamento(leitura[2]);
				p.setTipoEntrega(leitura[3]);
				p.setStatusPedido(StatusPedido.valueOf(leitura[4]));
				;
				lista.add(p);
				linha = lerArq.readLine();
			}

			arq1.close();
			return lista;
		} catch (IOException e) {
			System.err.printf("Erro na Abertura do Arquivo: %s. \n", e.getMessage());
			return null;
		}
	}

	public boolean gravar(List<Pedido> lista) {
		try {
			FileWriter arq = new FileWriter("pedidos.csv", true);
			PrintWriter gravarArq = new PrintWriter(arq);
			for (Pedido pedido : lista) {
				gravarArq.printf("%d,%s,%s,%s,%s,%s,%s\n", pedido.getCodigo(),ListaPedidos.retornaData(pedido.getData()), 
														   pedido.getFormaPagamento(), pedido.getTipoEntrega(), pedido.getStatusPedido(), 
														   pedido.listaBebidas, pedido.listaPizzas);
			}
			
			arq.close();
			return true;
		} catch (IOException e) {
			return false;
		}
	}
	
}