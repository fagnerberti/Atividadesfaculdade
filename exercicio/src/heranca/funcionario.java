package heranca;

public abstract class funcionario extends Pessoa {
	private int tempoDeServico, matricula;
	private double salarioBase;
	public funcionario (String nome, String cpf, double salarioBase, int tempoDeServico, int matricula ) {
		super(nome,cpf);
		
		this.salarioBase = salarioBase;
		this.matricula = matricula;
		this.tempoDeServico = tempoDeServico;
	}
	
	public int getTempoDeServico() {
		return tempoDeServico;
	}
	public void setTempoDeServico(int tempoDeServico) {
		this.tempoDeServico = tempoDeServico;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	public abstract double computaSalario();
		
		
	

	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return super.equals(arg0);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}
