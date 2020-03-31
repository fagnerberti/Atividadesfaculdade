package helloword;

import controledeFluxo.Controledefluxo;
import operacoesMatematicas.operadores;

public class main {

	public static void main(String[] args) {
//		
//		
//		operadores var = new operadores();
//		var.soma(2, 3);
//		System.out.println("..............");
//		var.divisao(150, 2);
//		System.out.println("..............");
//		var.multiplicacao(10, 12);
//		System.out.println("..............");
//		var.subtracao(10, 2);
//		System.out.println("..............");
//		var.divisao();
//		System.out.println("..............");
//	}
		

	int idade = 18;
	
	Controledefluxo id = new Controledefluxo();
	id.beber(idade);
	System.out.println(".......");
	
	int novaIdade = id.crescer(idade);
	System.out.println(".......");
	
	id.beber(idade);
	System.out.println(".......");
	
	id.beberTodas(novaIdade);
}}
