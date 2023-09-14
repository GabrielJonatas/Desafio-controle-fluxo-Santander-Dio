package desafioControleFluxo;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int numero1 = scanner.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int numero2 = scanner.nextInt();
		
		try {
			contar(numero1,numero2);			
		} catch (ParametrosInvalidosException e) {
			System.out.print(e.getMessage());
		}
		
	}
	
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException{
		if (parametroUm > parametroDois) throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
		
		for (int i = parametroUm; i <= parametroDois; i++) {
			System.out.print("Imprimindo o número " + i + "\n");
		}
	}

}
