package pizzaria;

import java.sql.Time;
import java.util.Date;
import java.util.List;

public class Pedido {
	private int codigo;
	private Date data;
	private Time hora;
	private String status;
	private String formaPagamento;
	private String tipoEntrega;
	private List<Bebida> listaBebidas;
	private List<Pizza> listaPizzas;

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

	public Time getHora() {
		return hora;
	}

	public void setHora(Time hora) {
		this.hora = hora;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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
		builder.append(", hora=");
		builder.append(hora);
		builder.append(", status=");
		builder.append(status);
		builder.append(", formaPagamento=");
		builder.append(formaPagamento);
		builder.append(", tipoEntrega=");
		builder.append(tipoEntrega);
		builder.append(", listaBebidas=");
		builder.append(listaBebidas);
		builder.append(", listaPizzas=");
		builder.append(listaPizzas);
		builder.append("]");
		return builder.toString();
	}

}
