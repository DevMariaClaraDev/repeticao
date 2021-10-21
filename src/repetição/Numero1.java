package repetição;

import java.util.Scanner;

public class Numero1 {

	public static void main(String[] args) {

		Scanner numero = new Scanner(System.in);
		int valor = 0;

		System.out.print("Digite o valor de um número entre 0 e 10: ");
		valor = numero.nextInt();

		while (valor < 0 || valor > 10) {

			System.out.println("Este valor é um valor inválido");

			System.out.print("Digite o valor de um número entre 0 e 10: ");
			valor = numero.nextInt();
		}

	}

}
