package exercicios;

import java.util.Scanner;

public class Exercicio01_Vetores {

	public static void main(String[] args) {
		// Algoritmo que cria um vetor de 10 números inteiros não-ordenados e não repetidos e recebe um número aleatório digitado pelo usuário. Caso o número esteja dentro do vetor, ele exibe a posição do número, se não, ele exibe que o número não foi encontrado
		
		// Criação das variáveis e do Scanner
		int vetor[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		int numero;
		Scanner input = new Scanner(System.in);
		
		// Leitura do número e exibição da resposta
		
		//for(int i = 0; i < 2; i++) { // O primeiro for loop é apenas para demonstrar dois exemplos, será comentado posteriormente
			System.out.print("Digite o número que você deseje encontrar: ");
			numero = input.nextInt();
			
			for(int x = 0; x < 10; x++) {
				if(vetor[x] == numero) { //Caso o número do usuário seja encontrado
					System.out.print("O número " + numero + " está localizado na posição: " + x + ".\n\n");
					break; //Para o for
				}
				if(x == 9) { //Caso x chegue a 9 (i.e., já tenha iterado por toda a lista) sem encontrar o número
					System.out.print("O número " + numero + " não foi encontrado!\n\n");
				}
			}
		//}	
	}
}
