package com.projetos.pilha;

public class Main {

    public static void main(String[] args) {
        Pilha pilha = new Pilha();
        No no1 = new No(1);
        No no2 =  new No(2);
        No no3 =  new No(3);

        System.out.println(pilha.toString());
        pilha.push(no1);
        System.out.println(pilha.toString());
        pilha.push(no2);
        pilha.push(no3);
        System.out.println(pilha.toString());
        System.out.println(pilha.pop());
        System.out.println(pilha.toString());

    }

}
