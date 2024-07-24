import java.util.UUID;

public class PlanoAssinatura {
	private UUID id;
    private String nomePlano;
    private double precoMensal;
    private String recursosPremium;

    
    public PlanoAssinatura(int id, String nomePlano, double precoMensal, String recursosPremium) {
        this.id = UUID.randomUUID();
        this.nomePlano = nomePlano;
        this.precoMensal = precoMensal;
        this.recursosPremium = recursosPremium;
    }


	public UUID getId() {
		return id;
	}


	public String getNomePlano() {
		return nomePlano;
	}
	public void setNomePlano(String nomePlano) {
		this.nomePlano = nomePlano;
	}


	public double getPrecoMensal() {
		return precoMensal;
	}
	public void setPrecoMensal(double precoMensal) {
		this.precoMensal = precoMensal;
	}


	public String getRecursosPremium() {
		return recursosPremium;
	}
	public void setRecursosPremium(String recursosPremium) {
		this.recursosPremium = recursosPremium;
	} 
}
