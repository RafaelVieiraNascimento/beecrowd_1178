package program;

/*
beecrowd | 1178 - Preenchimento de Vetor III

Leia um valor X. Coloque este valor na primeira posição de um vetor N[100].
Em cada posição subsequente de N (1 até 99), coloque a metade do valor armazenado na posição anterior,
conforme o exemplo abaixo. Imprima o vetor N.

Entrada
A entrada contem um valor de dupla precisão com 4 casas decimais.

Saída
Para cada posição do vetor N, escreva "N[i] = Y", onde i é a posição do vetor e Y é o valor armazenado naquela posição.
Cada valor do vetor deve ser apresentado com 4 casas decimais.
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double[] N = new double[100];

		double X = sc.nextDouble();

		for (int i = 0; i < N.length; i++) {
			N[i] = X;
			X /= 2;
		}
		for(int i = 0; i < N.length; i++) System.out.printf("N[%d] = %.4f\n", i, N[i]);
		sc.close();
	}
}