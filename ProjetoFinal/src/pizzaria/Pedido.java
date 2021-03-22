package pizzaria;

import java.sql.Time;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.List;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;

public class Pedido {
	private int codigo;
	private Date data;
	private String tipoEntrega;
	private String formaPagamento;
	private StatusPedido statusPedido;
	protected List<Bebida> listaBebidas;
	protected List<Pizza> listaPizzas;
	

	public StatusPedido getStatusPedido() {
		return statusPedido;
	}

	public void setStatusPedido(StatusPedido statusPedido) {
		this.statusPedido = statusPedido;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public String getTipoEntrega() {
		return tipoEntrega;
	}

	public void setTipoEntrega(String tipoEntrega) {
		this.tipoEntrega = tipoEntrega;
	}
	
	public boolean addBebida(Bebida bebida) {
		return listaBebidas.add(bebida);
	}

	public boolean addPizza(Pizza pizza) {
		return listaPizzas.add(pizza);
	}
	
	public Pedido() {
		listaBebidas = new ArrayList<>();
		listaPizzas = new ArrayList<>();
	}
	

	public List<Bebida> getListaBebidas() {
		return listaBebidas;
	}

	public void setListaBebidas(List<Bebida> listaBebidas) {
		this.listaBebidas = listaBebidas;
	}

	public List<Pizza> getListaPizzas() {
		return listaPizzas;
	}

	public void setListaPizzas(List<Pizza> listaPizzas) {
		this.listaPizzas = listaPizzas;
	}

	public double getTotal() {
		double total = 0;
		for (Bebida bebida : listaBebidas) {
			total += bebida.getPreco();
		}
		for (Pizza pizza : listaPizzas) {
			total += pizza.getPreco();
		}
		return total;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pedido [codigo=");
		builder.append(codigo);
		builder.append(", data=");
		builder.append(data);
		builder.append(", tipoEntrega=");
		builder.append(tipoEntrega);
		builder.append(", formaPagamento=");
		builder.append(formaPagamento);
		builder.append(", listaBebidas=");
		builder.append(listaBebidas);
		builder.append(", listaPizzas=");
		builder.append(listaPizzas);
		builder.append(", statusPedido=");
		builder.append(statusPedido);
		builder.append("]");
		return builder.toString();
	}

}
