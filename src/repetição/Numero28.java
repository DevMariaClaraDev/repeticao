package repetição;

import java.util.Scanner;

public class Numero28 {

	public static void main(String[] args) {

		Scanner numero = new Scanner(System.in);
		float temperatura, maior = 0, menor = 0, soma = 0, media = 0, outro = 0, temperatura1 = 0;
		int x = 0;

		System.out.print("Informe qual foi a temperatura registrada: ");
		temperatura = numero.nextFloat();

		while (outro != 2999888) {

			soma = soma + temperatura;
			x = x + 1;
			temperatura1 = temperatura;

			if (maior > temperatura) {
				temperatura = maior;
			}

			if (menor < temperatura) {
				temperatura1 = menor;
			}

			System.out.print("Informe qual foi a temperatura registrada. Se desejar parar digite 2999888: ");
			outro = numero.nextFloat();

			if (outro != 2999888) {

				maior = outro;
				menor = maior;
			}
		}

		media = soma / x;

		System.out.println(String.format("A média das temperaturas é: %.2f", media));
		System.out.println(String.format("A maior temperatura é: %.2f", temperatura));
		System.out.println(String.format("A menor temperatura é: %.2f", temperatura1));

	}

}
