package repetição;

public class Numero25 {

	public static void main(String[] args) {

		float valor;

		for (int x = 1; x <= 50; x++) {

			valor = x * 1.99f;

			System.out.print(x);
			System.out.print("- R$");
			System.out.println(String.format("%.2f", valor));
		}

	}

}
