package repetição;

import java.util.Scanner;

public class Numero20 {

	public static void main(String[] args) {

		Scanner numero = new Scanner(System.in);
		int quantidade, idade, media = 0;

		System.out.print("Digite a quantidade de pessoas cuja a média das idades deverá ser calculada: ");
		quantidade = numero.nextInt();

		for (int x = 1; x <= quantidade; x++) {

			System.out.print("Digite as idades: ");
			idade = numero.nextInt();

			media = (media + idade);
		}

		media = media / quantidade;
		System.out.println("A media das idades é: " + media);

		if (media >= 0 && media <= 25)
			System.out.println("A turma é jovem");

		else if (media >= 26 && media <= 60)
			System.out.println("A turma é adulta");

		else
			System.out.println("A turma é idosa");

	}

}
