package desafio_estagio;

import java.util.Scanner;

public class FibonacciRecursiva {

	static int fibonacci(int n) {
		if (n == 1 || n == 2) return 1;
		else {
			return fibonacci(n - 1) + fibonacci(n - 2);
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
