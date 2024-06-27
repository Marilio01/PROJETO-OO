public class Paciente extends Usuario {
	
	private String cpf;
	private String nascimento;
	private String planoDeAssinatura;
	private String historicoDePagamentos;
	
	
	public Paciente(String cpf, String nascimento, String planoDeAssinatura, String historicoDePagamentos,
			String nome, String email, String senha, String string) {
		super(nome, email, senha, string);
		this.cpf = cpf;
		this.nascimento = nascimento;
		this.planoDeAssinatura = planoDeAssinatura;
		this.historicoDePagamentos = historicoDePagamentos;
	}

	
	public void atualizarPlanoAssinatura(String novoPlano) {
	        this.planoDeAssinatura = novoPlano;
	}
	 
	 
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	public String getNascimento() {
		return nascimento;
	}
	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}
	
	
	public String getPlanoDeAssinatura() {
		return planoDeAssinatura;
	}
	public void setPlanoDeAssinatura(String planoAssinatura) {
		this.planoDeAssinatura = planoAssinatura;
	}
	
	
	public String getHistoricoDePagamentos() {
		return historicoDePagamentos;
	}
	public void setHistoricoDePagamentos(String historicoPagamentos) {
		this.historicoDePagamentos = historicoPagamentos;
	}
}
