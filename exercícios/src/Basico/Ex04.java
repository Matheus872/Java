//        Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
//        mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
//        (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)


package Basico;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Ex04 {

    public static void main(String[] args) {

        String idade = "";
        List<String> aux = new ArrayList<String>();
        Scanner input = new Scanner(System.in);
        System.out.println("Insira a idade  (dd-MM-yyyy): ");
        idade = input.next();

        int dia, mes, ano, soma = 0;
        aux = Arrays.stream(idade.split("-")).collect(Collectors.toList());
        System.out.println(aux);
        dia = Integer.parseInt(aux.get(0));
        mes = Integer.parseInt(aux.get(1));
        ano = Integer.parseInt(aux.get(2));

        soma = dia + (mes * 30) + (ano * 365);
        System.out.println("Idade em dias: " + soma);
    }

}
