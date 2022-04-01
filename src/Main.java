import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("Criando conta do cliente...");

		Scanner sc = new Scanner(System.in);
		System.out.print("\nDigite nome do novo cliente:");
		String nomeCliente = sc.nextLine();

		Cliente cliente = new Cliente();
		cliente.setNome(nomeCliente);

		System.out.println("Deseja abrir uma conta corrente ou poupanca?");
		System.out.println("Digite 1 para C.C, 2 para poupanca e 3 para ambos");
		System.out.print("<1/2/3>?:");
		int tipoContaAberta = sc.nextInt();

		if (tipoContaAberta == 1) {
			Conta cc = new ContaCorrente(cliente);
			cc.imprimirExtrato();
		}
		else if (tipoContaAberta == 2) {
			Conta poupanca = new ContaPoupanca(cliente);
			poupanca.imprimirExtrato();
		}
		else if (tipoContaAberta == 3) {
			Conta cc = new ContaCorrente(cliente);
			cc.imprimirExtrato();
			Conta poupanca = new ContaPoupanca(cliente);
			poupanca.imprimirExtrato();
		}
		else {
			System.out.println("Opcao invalida");
		}

	}

}
