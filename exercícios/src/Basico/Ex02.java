
//Crie um programa que exiba a tabuada de um número informado pelo usuário.

package Basico;
import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Insira um número: ");
        int num = input.nextInt();
        for (int n = 0;n < 9;n++){
            System.out.println(n*num);
        }
    }

}
