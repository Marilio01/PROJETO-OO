
public class RespostaPagamento {
	private boolean sucesso;
	private String mensagem;
	
	
	public RespostaPagamento(boolean sucesso, String mensagem) {
		super();
		this.sucesso = sucesso;
		this.mensagem = mensagem;
	}


	public boolean isSucesso() {
		return sucesso;
	}


	public String getMensagem() {
		return mensagem;
	}

}
