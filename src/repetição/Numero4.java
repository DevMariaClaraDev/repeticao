package repeti��o;

import java.util.Scanner;

public class Numero4 {

	public static void main(String[] args) {

		Scanner numero = new Scanner(System.in);
		int habitante1, habitante2, taxa1, taxa2, resultado1, resposta1, resultado2, resposta2, x = 0;

		System.out.print("Digite o n�mero de habitantes do pa�s A: ");
		habitante1 = numero.nextInt();

		System.out.print("Digite o n�mero de habitantes do pa�s B: ");
		habitante2 = numero.nextInt();

		System.out.print("Digite a taxa de crescimento do pa�s A: ");
		taxa1 = numero.nextInt();

		System.out.print("Digite a taxa de crescimento do pa�s B: ");
		taxa2 = numero.nextInt();

		resultado1 = (habitante1 / 100) * taxa1;
		resposta1 = resultado1 + habitante1;

		resultado2 = (habitante2 / 100) * taxa2;
		resposta2 = resultado2 + habitante2;

		while (resposta2 <= resposta1) {

			resultado1 = (habitante1 / 100) * taxa1;
			resposta1 = resultado1 + resposta1;

			resultado2 = (habitante2 / 100) * taxa2;
			resposta2 = resultado2 + resposta2;

			x = x + 1;

		}

		System.out.print(
				"A quantidade de anos necess�rios para a popula��o do pa�s B ultrapassar a popula��o do pa�s A �:" + x);

	}

}
