// Multiplicação de Matriz por Escalar:
// Crie um programa que verifique se um login e senha confere com os dados de uma matriz 6x2.


import java.util.Scanner;

public class Exercicio2MATRIZ {
    public static void main(String[] args) throws Exception {
            Scanner ler = new Scanner(System.in);
            String nome;
            String senha;
            boolean a = false;
            String [][] ma ={    {"Sabrina", "111"},
                                 {"Arthur", "222"},
                                 {"Milene", "333"},
                                 {"Larissa", "444"},
                                 {"Enzo", "555"},
                                 {"lucas_gameplay", "666"} };
            
            System.out.println("Digite um Nome de usuário: ");
            nome = ler.nextLine();
            System.out.println("Digite uma senha: ");
            senha = ler.nextLine();
           for(int i = 0; i<6; i++){
                if(nome.equals(ma[i][0]) && senha.equals(ma[i][1])){
                    a = true;
                    }           
    }

        if(a == true){
            System.out.println("Os seus dados estão inseridos na matriz!");
                    
        }
        else{
            System.out.println("Os seus dados NÃO estão inseridos na matriz!");

        }

        ler.close();

    }

}

