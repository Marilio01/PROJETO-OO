import java.util.Date;
import java.util.UUID;

public class HistoricoPagamento {
	private UUID id;
	private Date dataPagamento;
	private double valor;
	private String statusPagamento;
	
	public HistoricoPagamento(int id, Date dataPagamento, double valor, String statusPagamento) {
		this.id = UUID.randomUUID();
		this.dataPagamento = dataPagamento;
		this.valor = valor;
		this.statusPagamento = statusPagamento;
	}


	public UUID getId() {
		return id;
	}


	public Date getDataPagamento() {
		return dataPagamento;
	}
	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}


	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}


	public String getStatusPagamento() {
		return statusPagamento;
	}
	public void setStatusPagamento(String statusPagamento) {
		this.statusPagamento = statusPagamento;
	}


	
}
