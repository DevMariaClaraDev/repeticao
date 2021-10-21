package repetição;

import java.util.Scanner;

public class Numero12 {

	public static void main(String[] args) {

		Scanner numero = new Scanner(System.in);
		int valor, resultado, anterior, sucessor, a, b, c, d, atual2;

		System.out.print("Informe o valor: ");
		valor = numero.nextInt();

		a = 0;
		b = 1;
		c = 1;
		d = 2;

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

		for (int atual = 2; atual <= valor; atual++) {

			a = 0;
			b = 1;
			c = 1;
			d = 2;
			atual2 = atual;

			anterior = atual - 1;
			sucessor = anterior + atual2;

			System.out.println(sucessor);

		}

	}

}
