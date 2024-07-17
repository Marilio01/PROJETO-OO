public class Médico extends Usuario {
	
	private String crm;
	private String especialidade;
	private double valorDaConsulta;
	
	
	public Médico(String crm, String especialidade, double valorDaConsulta, 
			String nome, String email, String senha, String string) {
		super(nome, email, senha, string);
		this.crm = crm;
		this.especialidade = especialidade;
		this.valorDaConsulta = valorDaConsulta;
	}
	
	
	public void definirValorConsulta(double valor) {
	       this.valorDaConsulta = valor;
	}
	
	
	public String getCrm() {
		return crm;
	}
	public void setCrm(String crm) {
		this.crm = crm;
	}
	
	
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	
	public double getValorDaConsulta() {
		return valorDaConsulta;
	}
	public void setValorDaConsulta(double valorDaConsulta) {
		this.valorDaConsulta = valorDaConsulta;
	}
	
	
	
}