// Transposição de Matriz:
// Desenvolva um código que realiza a transposição de uma matriz (as colunas viram linhas e as linhas viram colunas). 
// Peça aos usuários para inserirem os elementos da matriz, exibindo a matriz transposta no console.


import java.util.Scanner;

public class Exercicio3MAtriz {
    public static void main(String[] args) throws Exception {

    Scanner ler = new Scanner(System.in);

    int [][]m = new int[2][3]; 
	int b;
	int i; 
	for( i = 0; i <2; i++){
		for(b =0; b <3; b++){
			System.out.println("Digite um numero: ");
			m[i][b] = ler.nextInt();
	}}

	for(int c = 0; c<3; c++){
			for(int d = 0; d<2; d++){
			System.out.print( m[d][c]+" "); 
			}
			System.out.print("\n"); 
		}
    }
}
