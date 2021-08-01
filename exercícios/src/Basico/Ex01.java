
//Crie um programa que efetue a leitura de um nome e exiba a mensagem “olá nome informado“.

package Basico;
import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            String name = "";
            System.out.println("Insira o seu nome: ");
            name = input.nextLine();
            System.out.println("Olá " + name + "!");
    }

}
