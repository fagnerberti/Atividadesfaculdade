package orientacaoobjeto;


import java.util.Scanner;

public class main {
	
	private static Scanner input;
	public static void main(String[] args) {
		//criando um objeto
//		Conta minhaConta =  new Conta();
//		minhaConta.setTitular("Fagner");
//		String nome = minhaConta.getTitular();
//		System.out.printf("Conta do %s", nome);
		
//Cria um objeto scanner para obter a entrada de dados apartir da janela de comando - console	
		
		Scanner input = new Scanner(System.in);
		
	//criar um objeto do tipo conta
		ContaCorrente minhaconta = new ContaCorrente();
		System.out.printf("nome do titular é : %s%n%n", minhaconta.getTitular() );
		
		//menssagem para inserir o nome do titular da conta
		System.out.println("Por favor entre com o seu nome : ");
		String nomeTitular = input.nextLine(); // ler uma linha do console
		minhaconta.setTitular(nomeTitular);
		System.out.println();
		System.out.printf("Seja bem vindo : %s%n%n", minhaconta.getTitular());
	
	}
	
	
}
