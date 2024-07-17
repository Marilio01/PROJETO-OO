import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	Pagamento pagamento = null;
	
	System.out.println("Escolha o método de pagamento:");
		System.out.println("[ 1 ] Cartão de crédito");
		System.out.println("[ 2 ] jj");
		int escolha = sc.nextInt();
		sc.nextLine();
		switch(escolha) {
			case 1:
			System.out.println("Digite o número do cartão: ");
			String numero = sc.nextLine();
			System.out.println("Digite o nome do titular: ");
			String titular = sc.nextLine();
			System.out.println("Digite a data de validade (MM/AA): ");
			String validade = sc.nextLine();
			System.out.println("Digite o CVV: ");
			String cvv = sc.nextLine();
			new CartaoCredito(numero, titular, validade, cvv);
			break;
			case 2:
			break;
			default:
				System.out.println("Método de pagamento inválido");
				System.exit(0);
			}
		System.out.println("Digite a quantia: ");
		double quantia = sc.nextDouble();
		
		if (pagamento != null) {
			pagamento.pagar(quantia);
		}
 
		sc.close();
	}

}