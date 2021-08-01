// Crie um programa que troque os valores que estão armazenados nas variáveis nome1 e nome2. A variável nome1
// armazenará o valor “mestre do universo”. A variável nome2 receberá um valor informado pelo usuário. Altere os
// valores das variáveis e exiba a soma da variável nome1 com o valor da variável nome2.


package Basico;
import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String nome1 = "";
        String nome2 = "Mestre do Universo";
        String aux = "";

        System.out.println("Insira o valor de nome1: ");
        nome1 = input.next();
        aux = nome1;
        nome1 = nome2;
        nome2 = aux;
        System.out.println(nome2.concat(nome1));
    }


}
