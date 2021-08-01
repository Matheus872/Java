package Basico.Ex08;
import java.util.Scanner;


public class Application {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

         String nome;
         String sobreNome;
         Integer dia;
         Integer mes;
         Integer ano;

        System.out.println("Insira o seu nome: ");
        nome = input.next();
        System.out.println("Insira o seu sobrenome:");
        sobreNome = input.next();
        System.out.println("Insira o ano do seu nascimento:");
        ano = input.nextInt();
        System.out.println("Insira o mes do seu nascimento:");
        mes = input.nextInt();
        System.out.println("Insira o dia do seu nascimento:");
        dia = input.nextInt();

        HeartRates coracao = new HeartRates(nome, sobreNome, dia, mes, ano);
        System.out.println(coracao.toString());
        System.out.println("Idade em anos: " + coracao.calculaIdadeEmAnos().toString());
        System.out.println("Frequência cardíaca máxima: " + coracao.calculaFrequenciaCardiacaMaxima(coracao.calculaIdadeEmAnos()).toString());
        System.out.println("Frequência cardíaca alvo: " + coracao.calculaFrequenciaCardiacaAlvo(coracao.calculaFrequenciaCardiacaMaxima(coracao.calculaIdadeEmAnos())));


    }


}
