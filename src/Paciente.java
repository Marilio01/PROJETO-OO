import java.util.ArrayList;
import java.util.Date;

public class Paciente extends Usuario {
	
	private String cpf;
	private Date nascimento;
	private PlanoAssinatura plano;
	private ArrayList<HistoricoPagamento> historicoPagamentos;
	
	
	public Paciente(String nome, String email, String senha, String cpf, Date nascimento,
			PlanoAssinatura plano, ArrayList<HistoricoPagamento> historicoPagamentos) {
		super(nome, email, senha);
		this.cpf = cpf;
		this.nascimento = nascimento;
		this.plano = plano;
		this.historicoPagamentos = historicoPagamentos;
	}

	
	public void atualizarPlanoAssinatura(PlanoAssinatura novoPlano) {
	        this.plano = novoPlano;
	}
	 
	  public void visualizarConsultas(ArrayList<Consulta> consultas) {
	       for (Consulta consulta : consultas) {
	           if (consulta.getPaciente().equals(this)) {
	               System.out.println(consulta);
	           }
	       }
	   }
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	public Date getNascimento() {
		return nascimento;
	}
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	
	
	public PlanoAssinatura getPlano() {
		return plano;
	}
	public void setPlano(PlanoAssinatura plano) {
		this.plano = plano;
	}


	public ArrayList<HistoricoPagamento> getHistoricoPagamentos() {
		return historicoPagamentos;
	}
	public void setHistoricoPagamentos(ArrayList<HistoricoPagamento> historicoPagamentos) {
		this.historicoPagamentos = historicoPagamentos;
	}
	
	
	
}