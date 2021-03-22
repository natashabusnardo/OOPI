package pizzaria;

import java.io.FileNotFoundException;
import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class MainPizzaria {

	public static void main(String[] args) throws FileNotFoundException, ParseException {
		// TODO Auto-generated method stub
		List<Pedido> pedidos = new ArrayList<Pedido>();
		
		

		GravarCsv csv = new GravarCsv();
		GravarJson json = new GravarJson();
		GravarXml xml = new GravarXml();

		Persistencia pers = new Persistencia(csv);
		Persistencia pers2 = new Persistencia(xml);
		Persistencia pers3 = new Persistencia(json);
		
		Pedido pedido = new Pedido();

		Bebida b1 = new Bebida(0, "Coca Cola Lata", 1.99, false);
		Bebida b2 = new Bebida(1, "Skol Lata", 5.75, true);

		Pizza p1 = new Pizza(0, "Pizza 1", 40.99, "Grande", "Calabresa");

		pedido.addPizza(p1);

		pedido.addBebida(b1);
		pedido.addBebida(b2);

		pedido.setCodigo(0);
		pedido.setData(ListaPedidos.retornaData("12/01/2000 20:59:00"));
		pedido.setFormaPagamento("Cartão");
		pedido.setTipoEntrega("Balcão");
		pedido.setStatusPedido(StatusPedido.APROVADO);

		pedidos.add(pedido);
		
		System.out.println(pedido.listaBebidas);

		pers.gravar(pedidos);
		pers2.gravar(pedidos);
		pers3.gravar(pedidos);

		System.out.println(pedidos);
		System.out.println(pedido.getTotal());

	}

}
