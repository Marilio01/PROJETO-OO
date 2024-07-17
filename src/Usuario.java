import java.util.UUID;

public class Usuario {
    protected String id;
    protected String nome;
    protected String email;
    protected String senha;
    
    
	public Usuario( String nome, String email, String senha, String string) {
		this.id =UUID.randomUUID().toString();
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}
	
	
	public boolean login(String email, String senha) {
		return this.email.equals(email) && this.senha.equals(senha);
	}
	
	
	public void logout() {
		System.out.println("Usuário deslogado.");
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	}