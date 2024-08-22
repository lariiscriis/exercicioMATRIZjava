// Soma de Matrizes:
// Desenvolva um programa que realiza a soma de duas matrizes 3X3, exibindo o resultado no console. 

import java.util.Scanner; 
public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int [][]ma = new int[3][3]; 
    int [][]mb = new int [3][3];
    int soma = 0;

        for(int i=0; i<3; i++ ){             
                for(int j=0; j<3;j++){
                    System.out.println("Popule a primeira matriz: ");
                    ma[i][j] = ler.nextInt();
                }
    
        }

        for(int l = 0; l<3; l++){
            for(int c = 0; c <3; c++){
                System.out.println("Popule a segunda matriz: ");
                mb[l][c] = ler.nextInt();
            }
        }
        System.out.println("O valor da soma das matrizes é: \n");
        for(int x = 0; x<3; x++){
            for(int z = 0; z<3; z++){
                soma = ma[x][z] + mb[x][z];                
                System.out.print(soma);

            }  System.out.println("");

        }
      
      
  
           ler.close();

}