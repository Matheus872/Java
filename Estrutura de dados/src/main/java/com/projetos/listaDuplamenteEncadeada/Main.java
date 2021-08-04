package com.projetos.listaDuplamenteEncadeada;

public class Main {

    public static void main(String[] args) {
        ListaEncadeada<String> lista = new ListaEncadeada<String>();

        lista.add("olá");
        lista.add("Mundo");
        System.out.println("Indice 0: "+ lista.get(0) + ", indice 1: "+lista.get(1));

        lista.add("IntrusO",0);
        System.out.println(lista);
        lista.remove(0);

        lista.add("IntrusO",1);
        System.out.println(lista);
        lista.remove(1);

        lista.add("IntrusO",2);
        System.out.println(lista);
    }
}
