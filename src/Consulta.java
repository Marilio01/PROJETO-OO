import java.util.Date;
import java.util.UUID;

public class Consulta {
    private UUID id;
    private Date dataHora;
    private Paciente paciente;
    private Médico medico;
    private String status;
    private String observacoes;

    public Consulta(String id, Date dataHora, Paciente paciente, Médico medico, String status, String observacoes) {
        this.id = UUID.randomUUID();
        this.dataHora = dataHora;
        this.paciente = paciente;
        this.medico = medico;
        this.status = status;
        this.observacoes = observacoes;
    }

    
    public void atualizarStatus(String novoStatus) {
        this.status = novoStatus;
    }

    
    public UUID getId() {
        return id;
    }

    
    public Date getDataHora() {
        return dataHora;
    }
    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    
    public Paciente getPaciente() {
        return paciente;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    
    public Médico getMedico() {
        return medico;
    }
    public void setMedico(Médico medico) {
        this.medico = medico;
    }

    
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    
    public String getObservacoes() {
        return observacoes;
    }
    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }   
}