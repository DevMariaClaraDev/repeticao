package repeti��o;

import java.util.Scanner;

public class Numero1 {

	public static void main(String[] args) {

		Scanner numero = new Scanner(System.in);
		int valor = 0;

		System.out.print("Digite o valor de um n�mero entre 0 e 10: ");
		valor = numero.nextInt();

		while (valor < 0 || valor > 10) {

			System.out.println("Este valor � um valor inv�lido");

			System.out.print("Digite o valor de um n�mero entre 0 e 10: ");
			valor = numero.nextInt();
		}

	}

}
