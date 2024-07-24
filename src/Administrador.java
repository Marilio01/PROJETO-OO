import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Administrador extends Usuario{

	public Administrador(String nome, String email, String senha) {
		super(nome, email, senha);
	}
	
	
    public void gerenciarUsuarios(ArrayList<Usuario> usuarios) {
        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
        }
    }
}