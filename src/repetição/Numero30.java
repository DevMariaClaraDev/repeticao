package repeti��o;

import java.util.Scanner;

public class Numero30 {

	public static void main(String[] args) {

		Scanner numero = new Scanner(System.in);
		int codigo = 1, codigo1 = 0, codigo2 = 0, codigo3 = 0, codigo4 = 0, x = 1;
		float altura, alturam, alturame, peso, pesom, pesome, somapeso = 0, somaaltura = 0;

		System.out.print("Digite o seu c�digo.");
		codigo = numero.nextInt();
		codigo1 = codigo;
		codigo2 = codigo;
		codigo3 = codigo;
		codigo4 = codigo;
		
		System.out.print("Digite a sua altura: ");
		alturam = numero.nextFloat();
		alturame = alturam;
		System.out.print("Digite o seu peso: ");
		pesom = numero.nextFloat();
		pesome = pesom;

		while (codigo != 0) {

			x = x + 1;

			System.out.print("Digite o seu c�digo. Para parar digite 0");
			codigo = numero.nextInt();

			if (codigo != 0) {
				System.out.print("Digite a sua altura: ");
				altura = numero.nextFloat();
				System.out.print("Digite o seu peso: ");
				peso = numero.nextFloat();

				somaaltura = somaaltura + altura;
				somapeso = somapeso + peso;

				if (altura > alturam) {
					alturam = altura;
					codigo1 = codigo;
				}
				if (peso > pesom) {
					pesom = peso;
					codigo2 = codigo;
				}
				if (altura < alturame) {
					alturame = altura;
					codigo3 = codigo;
				}
				if (peso < pesome) {
					pesome = peso;
					codigo4 = codigo;
				}
			}
		}

		System.out.println(String.format("A maior altura �: %.2f ", alturam));
		System.out.println("O respectivo c�digo �: " + codigo1);

		System.out.println(String.format("A menor altura �: %.2f ", alturame));
		System.out.println("O respectivo c�digo �: " + codigo2);

		System.out.println(String.format("O maior peso �: %.2f", pesom));
		System.out.println("O respectivo c�digo �: " + codigo3);

		System.out.println(String.format("O menor peso �: %.2f", pesome));
		System.out.println("O respectivo c�digo �: " + codigo4);

		System.out.println(String.format("A m�dia de altura �: %.2f", somaaltura / x));
		System.out.println(String.format("A m�dia de peso �: %.2f ", somapeso / x));

	}

}
