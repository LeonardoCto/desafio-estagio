package desafio_estagio;

import java.util.Scanner;

public class Fibonacci {

	static int fibonacci(int n) {

		int numeroA = 1;
		int numeroB = 0;
		int numero = 0;

		if (n == 0)
			return 0;
		else {

			for (int i = 1; i < n; i++) {
				numero = numeroA + numeroB;
				numeroB = numeroA;
				numeroA = numero;
			}
			return numero;
		}
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		System.out.println("Digite um número: ");
		numero = teclado.nextInt();
		if (numero < 0) {
			System.out.println("O número deve ser maior ou igual a 0");
		}
		for (int i = 1; i <= numero; i++) {
			System.out.println(fibonacci(i));
		}

		teclado.close();
	}

}
