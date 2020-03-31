package controledeFluxo;

public class Controledefluxo {
	 
	public void beber(int idade) {
		if(idade >= 18) {
			System.out.println("Pode beber");
		}
		
		else {
			
			System.out.println("Vai crescer");
		}
	}

	public int crescer(int idade) {
		while(idade < 18) {
			idade = idade +1;
		}
		return idade;
		
		
		
	}

	public void beberTodas(int novaIdade) {
		// TODO Auto-generated method stub
		for(int i = 0; i <= 10; ++i ) {
			System.out.printf("bebo %d", novaIdade + i);
			System.out.println("....");
		}
		
	}
}
