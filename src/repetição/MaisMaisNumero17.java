package repetição;

import java.util.Scanner;

public class MaisMaisNumero17 {

	public static void main(String[] args) {
	
		Scanner numero = new Scanner(System.in);
		int valor, divisores = 0;

		System.out.print("Informe um número inteiro: ");
		valor = numero.nextInt();

		for (int x = 1; x <= valor; x++) { 
			if (valor % x == 0) {
			divisores++;
			}
		}

		if (divisores == 2) {
			System.out.print("O número digitado é primo");
		}
		
		else {
			System.out.print("O número digitado não é primo");
		}

	}

}
