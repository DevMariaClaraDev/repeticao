package repeti��o;

import java.util.Scanner;

public class Numero18 {

	public static void main(String[] args) {

		Scanner numero = new Scanner(System.in);
		int x = 1, valor, resultado = 0, divisores = 0;

		System.out.print("Informe um n�mero inteiro: ");
		valor = numero.nextInt();

		for (int a = 1; a <= valor; a++) {
			if (x > 1)
				valor = valor - 1;

			for (x = 1; x <= valor; x++) {
				if (valor % x == 0)
					divisores++;

				if (divisores == 2)
					resultado = valor;

				System.out.println("Os n�meros primos s�o: " + resultado);
				System.out.println("A quantidade de divis�es foi: " + divisores);

			}
		}

		
		System.out.println("A quantidade de divis�es foi: " + divisores);

	
	}

}
