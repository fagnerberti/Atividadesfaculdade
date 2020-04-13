package heranca;

import java.awt.List;
import java.util.ArrayList;

public class Programador extends funcionario {
	private List<String> linguagens = new ArrayList<Stirng>();
	private String preferencia ;
	private Projeto projetoAtual;
	
	
	public Programador(String nome, String cpf, double salarioBase, int tempoDeServico, int matricula,
			String preferencia, Projeto projetoAtual) {
		super(nome, cpf, salarioBase, tempoDeServico, matricula);
		this.preferencia = preferencia;
		this.linguagens =  linguagens;
		this.projetoAtual = projetoAtual;
	}
	
	public List<Stirng> getLinguagens() {
		return linguagens;
	}
	public void setLinguagens(List<Stirng> linguagens) {
		this.linguagens = linguagens;
	}
	public String getPreferencia() {
		return preferencia;
	}
	public void setPreferencia(String preferencia) {
		this.preferencia = preferencia;
	}
	public Projeto getProjetoAtual() {
		return projetoAtual;
	}
	public void setProjetoAtual(Projeto projetoAtual) {
		this.projetoAtual = projetoAtual;
	}
	
	
	public void adicionaLinguagem() {
		
		
	}
	
	public void adicionaPorjeto() {}

	@Override
	public double computaSalario() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return "programador [preferencia=" + preferencia + ", projetoAtual=" + projetoAtual + " ]";
	}
	
	

}
