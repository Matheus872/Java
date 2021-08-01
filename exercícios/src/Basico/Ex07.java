//   Considere um vetor de 10 números inteiros positivos maiores que zero e um único número X inteiro,
//        também positivo e maior que zero. Faça um programa para:
//        (a) ler pelo teclado o vetor;
//        (b) ler pelo teclado o número X;
//        (c) encontrar e imprimir o par de posições consecutivas cujas componentes possuem a maior
//        distância entre elas;
//        (d) verificar se o vetor está em ordem crescente, decrescente ou não ordenado;
//        (e) dizer quantos números no vetor são maiores que X, menores que X e iguais a X.



package Basico;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vector = new int[10];
        System.out.println("Insert the vector: ");

        for (int n:vector){
            System.out.println("index " + n + ":");
            n = input.nextInt();
        }

        System.out.println("Insert the number X: ");
        int x = input.nextInt();
        int distance, aux = 0;
        int[] pair = new int[2];

        for (int n = 0; n < vector.length - 1; n++){
            distance = Math.abs(vector[n] - vector[n+1]);
            if (distance > aux){
                aux = distance;
                pair[0] = vector[n];
                pair[1] = vector[n+1];
            }
        }
        System.out.println("Pair with greater distance: " + pair[0] + "," + pair[1]);



    }



}
