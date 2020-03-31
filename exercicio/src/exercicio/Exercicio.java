package exercicio;

public class Exercicio {
int numero = 150;





	
	public void contador(int numero) {
		while(numero <= 300) {
			System.out.println(numero);
			numero++;
		}
		
		
		
		
	}

	public void ex2 (String[] args) {
		for(int a = 0, b = 0; a <= 1000; b++) {
			
			a = a + b;
			System.out.println(a);
		}
}
	
	public static void ex3 (String[] args) {
		
		for(int e = 0; e <= 100; e+=3) {
			System.out.println(e);
		}
	}
	public static void ex4 (String[] args) {
		long fat = 1;
		for (int n = 1; n <= 10; n++) {
			
			while (n>= 2) {
				fat = fat * n;
				break;
			}System.out.println("Fatorial de "+n+" = "+fat);
		}
	}
}