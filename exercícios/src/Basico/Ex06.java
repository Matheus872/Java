//Informar um saldo e imprimir o saldo com reajuste de 1%.

package Basico;
import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Insert the actual balance: ");
        Float balance = input.nextFloat();
        System.out.println("Balance with 1% readjustment: " + balance * 1.01);

    }

}
