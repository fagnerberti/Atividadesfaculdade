package construtorAula;

import java.util.Locale;
import java.util.Scanner;

public class TesteContrutor {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		Conta conta;

		System.out.println("Entre com o n�mero da conta: ");
		String numConta = input.nextLine();
		System.out.println("Digite seu nome: ");
		String titular = input.nextLine();

		conta = new Conta(0.0, numConta, titular);
		conta.imprimirDados();
		System.out.println("\n--------------------");

		// entrada de dados para depositos

		System.out.println("\nDeseja Fazer alguma opera��o? 1 - Sim / 0 - N�o : ");
		int op = input.nextInt();
		while (op == (1)) {
			System.out.println("\nQual opera��o deseja fazer? D - Dep�sito / S - Saque : ");
			String operacao = input.next();
			System.out.println();
			if (operacao.equalsIgnoreCase("d")) {
				System.out.println("\nPor favor, digite o valor do dep�sito: ");
				double valorDeposito = input.nextDouble();
				conta.deposito(valorDeposito);
				conta.imprimirDados();
				System.out.println("\n--------------------");
			} else if (operacao.equalsIgnoreCase("s")) {
				System.out.println("\nPor favor, digite o valor do saque: ");
				double valorSaque = input.nextDouble();
				conta.saque(valorSaque);
				conta.imprimirDados();
				System.out.println("\n--------------------");

			}

			else {
				System.out.println("\nN�o conseguimos indentificar o que deseja - OPERA��O FINALIZADA");
				break;
			}
			System.out.println("\nDeseja Fazer outra opera��o? 1 - Sim / 0 - N�o : ");
			int oper = input.nextInt();
			if (oper != 1) {
				System.out.println();
				System.out.println("OPERA��O FINALIZADA");
				break;

			}
		}

		input.close();
	}
}