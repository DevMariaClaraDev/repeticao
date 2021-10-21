package repetição;

import java.util.Scanner;

public class Numero27 {

	public static void main(String[] args) {

		Scanner numero = new Scanner(System.in);
		float valor = 1, soma = 0, forneceu = 0, resultado;
		int x = 1;

		while (valor > 0) {

			System.out.print("Informe o preço dos produtos: ");
			valor = numero.nextFloat();
			soma = soma + valor;
			System.out.print("Produto"  + x);
			System.out.print(": R$");
			System.out.println(valor);
			x = x + 1;

			if (valor == 0) {
				System.out.println("Digite o valor que o cliente forneceu: ");
				forneceu = numero.nextFloat();
				resultado = forneceu - soma;
				System.out.println(String.format("Total: %.2f", soma));
				System.out.println(String.format("Dinheiro: %.2f", forneceu));
				System.out.println(String.format("Troco: %.2f", resultado));
			}
		
		}

	}

}
