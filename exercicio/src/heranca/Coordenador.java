package heranca;

import java.awt.List;
import java.util.ArrayList;

public class Coordenador extends funcionario{
	private List<Projeto> projetos  = new ArrayList<Projeto>();
	
	
	
	public boolean removeProjeto() {}
	
	public Coordenador(String nome, String cpf, double salarioBase, int tempoDeServico, int matricula) {
		super(nome, cpf, salarioBase, tempoDeServico, matricula);
		// TODO Auto-generated constructor stub
	}

	public int getNumProjeto() {}

	@Override
	public double computaSalario() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	

}
