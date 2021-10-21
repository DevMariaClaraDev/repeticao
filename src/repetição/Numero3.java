package repetição;

import java.util.Scanner;

public class Numero3 {

	public static void main(String[] args) {

		Scanner numero = new Scanner(System.in);
		String nome, sexo, estado;
		int tamanho, idade;
		float salario;

		System.out.print("Digite o seu nome: ");
		nome = numero.next().toString();
		tamanho = nome.length();

		while (tamanho <= 3) {

			System.out.print("Digite o seu nome: ");
			nome = numero.next().toString();
			tamanho = nome.length();

		}

		System.out.print("Digite a sua idade: ");
		idade = numero.nextInt();

		while (idade < 0 || idade > 150) {

			System.out.print("Digite a sua idade: ");
			idade = numero.nextInt();

		}

		System.out.print("Digite o valor do seu salário: ");
		salario = numero.nextFloat();

		while (salario <= 0) {

			System.out.print("Digite o valor do seu salário: ");
			salario = numero.nextFloat();

		}

		System.out.print("Digite qual o seu sexo. Informe f para feminino ou m para masculino");
		sexo = numero.next().toString();

		while (!sexo.equals("f") || !sexo.equals("m")) {

			System.out.print("Digite qual o seu sexo. Informe f para feminino ou m para masculino");
			sexo = numero.next().toString();

		}

		System.out.print("Digite o seu estado civil. Escolha s, c, v ou d: ");
		estado = numero.next().toString();

		while (!estado.equals("s") || !estado.equals("c") || !estado.equals("v") || !estado.equals("d")) {

			System.out.print("Digite o seu estado civil. Escolha s, c, v ou d: ");
			estado = numero.next().toString();

		}

	}

}
