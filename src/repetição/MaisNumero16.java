package repeti��o;

import java.util.Scanner;

public class MaisNumero16 {

	public static void main(String[] args) {

		Scanner numero = new Scanner(System.in);
		float valor1, valor2, menorvalor, maiorvalor, soma;
		char variavel = 'N';

		System.out.print("Digite um valor inicial: ");
		valor1 = numero.nextFloat();
		valor2 = valor1;
		menorvalor = valor1;
		maiorvalor = valor1;
		soma = valor1;

		while (variavel == 'N') {

			System.out.print("Digite os valores desejados.");
			menorvalor = numero.nextFloat();
			maiorvalor = menorvalor;

			if (menorvalor < valor1) {
				valor1 = menorvalor;
			}
			if (maiorvalor > valor2) {
				valor2 = maiorvalor;
			}

			soma = soma + menorvalor;

			System.out.print("Deseja parar? Para parar digite S caso contr�rio digite N.");
			variavel = numero.next().charAt(0);

		}

		System.out.println("O menor valor �: " + valor1);
		System.out.println("O maior valor �: " + valor2);
		System.out.print("A soma dos valores �: " + soma);

	}

}