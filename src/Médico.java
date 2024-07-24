import java.util.ArrayList;

public class Médico extends Usuario {
	
	private String crm;
	private String especialidade;
	private double valorDaConsulta;
	private ArrayList<Consulta> agenda;
	
	
	public Médico(String nome, String email, String senha, 
			String crm, String especialidade, double valorDaConsulta) {
		super(nome, email, senha);
		this.crm = crm;
		this.especialidade = especialidade;
		this.valorDaConsulta = valorDaConsulta;
		this.agenda = new ArrayList<>();
	}
	
	
	public void definirValorConsulta(double valor) {
	       this.valorDaConsulta = valor;
	}
	
	
	public void visualizarAgenda() {
        for (Consulta consulta : agenda) {
            System.out.println(consulta);
        }
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


	public ArrayList<Consulta> getAgenda() {
		return agenda;
	}
	public void setAgenda(ArrayList<Consulta> agenda) {
		this.agenda = agenda;
	}
}