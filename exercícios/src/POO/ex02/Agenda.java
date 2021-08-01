//        Crie uma classe Agenda que pode armazenar 10 pessoas e que seja capaz de realizar as
//        seguintes operações:
//
//        void armazenaPessoa(String nome, int idade, float altura);
//        void removePessoa(String nome);
//        int buscaPessoa(String nome); // informa em que posição da agenda está a pessoa
//        void imprimeAgenda(); // imprime os dados de todas as pessoas da agenda
//        void imprimePessoa(int index); // imprime os dados da pessoa que está na posição “i” da
//        agenda.

package POO.ex02;

import POO.ex01.Pessoa;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Agenda {

    List<Pessoa> agenda = new ArrayList<Pessoa>(10);

    public Agenda(){

    }

    public Agenda(List<Pessoa> agenda){
        this.agenda = agenda;
    }

    public static void main(String[] args) {

        LocalDate nascimentoMatheus = LocalDate.of(2008, 05, 19);
        LocalDate nascimentoLunna = LocalDate.of(2006, 07, 31);
        LocalDate nascimentoPhellipe = LocalDate.of(1998, 9, 8);


        Agenda agenda = new Agenda();
        agenda.imprimeAgenda();
        System.out.println();

        agenda.armazenaPessoa("09876543210", "matheus", nascimentoMatheus, 1.68f);
        agenda.armazenaPessoa("1234567890", "lunna", nascimentoLunna, 1.50f);
        agenda.armazenaPessoa("54912874525", "phellipe", nascimentoPhellipe, 1.70f);
        agenda.imprimeAgenda();
        System.out.println();

        agenda.removePessoa("09876543210");
        agenda.imprimeAgenda();
        System.out.println();

        System.out.println("A posição do cpf buscado é: " + agenda.buscaPessoa("54912874525"));
        System.out.println();

        agenda.imprimePessoa(1);

    }


    public void armazenaPessoa(String cpf, String name, LocalDate birthDate, float height){
        Pessoa pessoa = new Pessoa(cpf, name, birthDate, height);
        agenda.add(pessoa);
    }

    public void removePessoa(String cpf){
        agenda.removeIf(pessoa -> pessoa.getCpf().equals(cpf));
    }

    public int buscaPessoa(String cpf){
        int retorno = 0;
        for(Pessoa pessoa:agenda){
            if(pessoa.getCpf().equals(cpf)){
                retorno =  agenda.indexOf(pessoa);
            }
        }
        return retorno;
    }

    public void imprimeAgenda() {
        if (agenda.isEmpty()) {
            System.out.println("Não há pessoas na agenda!");
        } else {
            System.out.println("elementos da agenda: ");
            for (Pessoa pessoa : agenda) {
                pessoa.printData();
            }
        }
    }

    public void imprimePessoa(int index){
        Pessoa pessoa = agenda.get(index);
        pessoa.printData();
    }

}
