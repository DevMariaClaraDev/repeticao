package repeti��o;

import java.util.Scanner;

public class MaisMaisNumero17 {

	public static void main(String[] args) {
	
		Scanner numero = new Scanner(System.in);
		int valor, divisores = 0;

		System.out.print("Informe um n�mero inteiro: ");
		valor = numero.nextInt();

		for (int x = 1; x <= valor; x++) { 
			if (valor % x == 0) {
			divisores++;
			}
		}

		if (divisores == 2) {
			System.out.print("O n�mero digitado � primo");
		}
		
		else {
			System.out.print("O n�mero digitado n�o � primo");
		}

	}

}
