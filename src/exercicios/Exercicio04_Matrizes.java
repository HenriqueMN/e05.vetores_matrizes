package exercicios;

import java.util.Scanner;

public class Exercicio04_Matrizes {

	public static void main(String[] args) {
		// Algoritmo que lê 4 notas de 10 alunes em uma matriz 10x4 e exibe um vetor com a média de cada um desses alunos
		
		// Criação das variáveis e do scanner
		float matriz[][] = new float[10][4];
		float vetor[] = new float[10];
		float soma;
		int i;
		Scanner input = new Scanner(System.in);
		
		// For loop
		for(i = 0; i < 10; i++) {
			soma = 0;
			for(int j = 0; j < 4; j++) {
				System.out.print("Insira a " + (j+1) + "ª nota do " + (i+1) + "º alune: ");
				matriz[i][j] = input.nextFloat();
				
				soma+= matriz[i][j];
				
				if(j == 3) {
					vetor[i] = soma/4;
				}
			}
		}
		
		// Output
		System.out.print("\nMédias: ");
		for(i = 0; i < 9; i++) {
			System.out.printf("%.1f" + " | ", vetor[i]);
		}
	}
}

/* 
 * 4.0 | 5.0 | 7.0 | 3.0 -
 * 2.5 | 6.5 | 4.7 | 8.0 -
 * 10.0| 8.5 | 9.5 | 8.0 -
 * 9.0 | 6.5 | 7.6 | 8.2 -
 * 5.0 | 5.0 | 5.0 | 6.3 -
 * 7.0 | 8.0 | 9.0 | 8.5 -
 * 5.5 | 3.5 | 2.5 | 1.0 -
 * 8.0 | 9.0 | 10.0| 9.5 -
 * 5.6 | 5.8 | 6.5 | 7.0 -
 * 7.5 | 8.5 | 9.5 |10.0 -
 * 
 * 4.8 | 5.4 | 9.0 | 7.8 | 5.3 | 8.1 | 3.1 | 9.1 | 6.2 | 8.9
 * 
 */
