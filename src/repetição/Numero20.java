package repeti��o;

import java.util.Scanner;

public class Numero20 {

	public static void main(String[] args) {

		Scanner numero = new Scanner(System.in);
		int quantidade, idade, media = 0;

		System.out.print("Digite a quantidade de pessoas cuja a m�dia das idades dever� ser calculada: ");
		quantidade = numero.nextInt();

		for (int x = 1; x <= quantidade; x++) {

			System.out.print("Digite as idades: ");
			idade = numero.nextInt();

			media = (media + idade);
		}

		media = media / quantidade;
		System.out.println("A media das idades �: " + media);

		if (media >= 0 && media <= 25)
			System.out.println("A turma � jovem");

		else if (media >= 26 && media <= 60)
			System.out.println("A turma � adulta");

		else
			System.out.println("A turma � idosa");

	}

}
