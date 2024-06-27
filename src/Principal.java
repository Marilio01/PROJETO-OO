import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Usuario usuario1 = new Usuario("joao","joao@gmail.com", "senha1234"," ");
		
		System.out.println(usuario1.getId());
		
		Paciente paciente1 = new Paciente("12345678901","12-12-1999","premium","primeira consulta"," "," "," "," ");
		System.out.println(paciente1.getNascimento());

	}

}
