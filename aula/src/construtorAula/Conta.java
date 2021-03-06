package construtorAula;

public class Conta {
	private double saldo;
	private String numConta;
	private String titular;

	// Contrutor da classe conta
	public Conta(double saldo, String numConta, String titular) {
		this.saldo = saldo;
		this.numConta = numConta;
		this.titular = titular;
	}

	public void imprimirDados() {
		System.out.println("Numero da conta: " + numConta + "\nTitular: " + titular + "\nSaldo: " + saldo);
	}

	public void deposito(double deposito) {
		this.saldo += deposito;

	}

	public void saque(double saque) {
		this.saldo -= saque;
	}

}
