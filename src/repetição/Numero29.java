package repetição;

import java.util.Scanner;

public class Numero29 {

	public static void main(String[] args) {

		Scanner numero = new Scanner(System.in);
		int valor1 = 0, valor2 = 0, resultado;

		System.out.print("Informe de qual tábuada você deseja obter os resultados: ");
		valor1 = numero.nextInt();

		System.out.print("Informe por quais números a tábuada será multiplicada: ");
		valor2 = numero.nextInt();

		for (int x = 1; x <= valor2; x++) {
			resultado = valor1 * x;
			System.out.print(valor1);
			System.out.print("X");
			System.out.print(x);
			System.out.print("=");
			System.out.println(resultado);

		}

	}

}
