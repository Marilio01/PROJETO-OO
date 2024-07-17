
public class CartaoCredito implements Pagamento{

	private String numero;
	private String titular;
	private String validade;
	private String cvv;
	
	public CartaoCredito(String numero, String titular, String validade, String cvv) {
		super();
		this.numero = numero;
		this.titular = titular;
		this.validade = validade;
		this.cvv = cvv;
	}

	@Override
	public void pagar(double quantia) {
		RespostaPagamento resposta = processarPagamento(numero, titular, validade, cvv, quantia);
		
		if (resposta.isSucesso()) {
			System.out.println("Pagamento bem sucessido: " + resposta.getMensagem());
		} else {
			System.out.println("Pagamento falhou: " + resposta.getMensagem());
		}
	}

	private RespostaPagamento processarPagamento(String numero, String titular, String validade, String cvv,
			double quantia) {
		boolean sucesso = true;
		String mensagem = "Transação aprovada!";
		if (numero.length() != 16) {
			sucesso = false;
			mensagem = "Número do cartão inválido!";
		} else if (quantia <= 0) {
			sucesso = false;
			mensagem = "Quantia inválida!";
		}
		return new RespostaPagamento(sucesso, mensagem);
	}

}
