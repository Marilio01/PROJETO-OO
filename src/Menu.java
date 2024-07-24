import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Menu {
	private static ArrayList<Usuario> usuarios = new ArrayList<>();
	private static ArrayList<Consulta> consultas = new ArrayList<>();
	
    
    public Menu() {
        inicializarDados();
    }

    private static void inicializarDados() {
	
    	Paciente paciente1 = new Paciente("João", "joao@gmail.com", "1234", "123.456.789-00", new Date(), null, null);
    	
	}

    void exibirMenuPrincipal() {
    	Scanner scanner = new Scanner(System.in);
    	while (true) {
    		System.out.println("=== Menu Principal ===");
	        System.out.println("1. Login");
	        System.out.println("2. Sair");
	        System.out.print("Escolha uma opção: ");
	        int opcao = scanner.nextInt();

	        switch (opcao) {
	        case 1:
	        	realizarLogin();
	        	break;
	        	case 2:System.out.println("Saindo...");
	        	scanner.close();
	        	return;
	        	default:
	        		System.out.println("Opção inválida.");
	            }
	        }
	    }

    private void realizarLogin() {
    	Scanner scanner = new Scanner(System.in);
	    System.out.print("Email: ");
	    String email = scanner.nextLine();
	    System.out.print("Senha: ");
	    String senha = scanner.nextLine();
	    for (Usuario usuario : usuarios) {
	    	if (usuario.login(email, senha)) {
	    		if (usuario instanceof Paciente) {
	    			exibirMenuPaciente((Paciente) usuario);
	    			} else if (usuario instanceof Médico) {
	    				exibirMenuMedico((Médico) usuario);
	                } else if (usuario instanceof Administrador) {
	                    exibirMenuAdministrador((Administrador) usuario);
	                }
	    		return;
	            }
	        }
	    System.out.println("Email ou senha incorretos.");
	    }

    private void exibirMenuPaciente(Paciente paciente) {
    	Scanner scanner = new Scanner(System.in);
	    while (true) {
	    	System.out.println("=== Menu Paciente ===");
	        System.out.println("1. Atualizar Plano de Assinatura");
	        System.out.println("2. Visualizar Consultas");
	        System.out.println("3. Logout");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
            case 1:
            	atualizarPlanoAssinatura(paciente);
            	break;
            	case 2:
            		paciente.visualizarConsultas(consultas);
            		break;
            		case 3:
            			paciente.logout();
            			return;
            			default:
            				System.out.println("Opção inválida.");
	            }
	        }
	    }

    private void exibirMenuMedico(Médico medico) {
    	Scanner scanner = new Scanner(System.in);
    	while (true) {
    		System.out.println("=== Menu Médico ===");
    		System.out.println("1. Definir Valor da Consulta");
    		System.out.println("2. Visualizar Agenda");
    		System.out.println("3. Logout");
    		System.out.print("Escolha uma opção: ");
    		int opcao = scanner.nextInt();

    		switch (opcao) {
    		case 1:
    			System.out.print("Novo valor da consulta: ");
    			double valor = scanner.nextDouble();
    			medico.definirValorConsulta(valor);
    			break;
    			case 2:
    				medico.visualizarAgenda();
    				break;
    				case 3:
    					medico.logout();
    					return;
    					default:
    						System.out.println("Opção inválida.");
	            }
	        }
	    }

    private void exibirMenuAdministrador(Administrador admin) {
    	Scanner scanner = new Scanner(System.in);
    	while (true) {
    		System.out.println("=== Menu Administrador ===");
    		System.out.println("1. Gerenciar Usuários");
    		System.out.println("2. Gerar Relatórios");
    		System.out.println("3. Logout");
    		System.out.print("Escolha uma opção: ");
    		int opcao = scanner.nextInt();

    		switch (opcao) {
    		case 1:
    			admin.gerenciarUsuarios(usuarios);
    			break;
    			case 2:
    				admin.gerarRelatorios();
    				break;
    				case 3:
    					admin.logout();
    					return;
    					default:
    						System.out.println("Opção inválida.");
	            }
	        }
	    }

    private void atualizarPlanoAssinatura(Paciente paciente) {
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("=== Atualizar Plano de Assinatura ===");
    	System.out.println("1. Básico - R$ 29,99/mês");
    	System.out.println("2. Premium - R$ 59,99/mês");
    	System.out.print("Escolha um novo plano: ");
    	int opcao = scanner.nextInt();

    	switch (opcao) {
    	case 1:
    		paciente.atualizarPlanoAssinatura(new PlanoAssinatura(1, "Básico", 29.99, "Acesso básico"));
    		break;
    		case 2:
    			paciente.atualizarPlanoAssinatura(new PlanoAssinatura(2, "Premium", 59.99, "Acesso premium"));
    			break;
	            default:
	            	System.out.println("Opção inválida.");
	        }
	    }
}
