package com.projetos.listaEncadeada;

public class Main {

    public static void main(String[] args) {
        ListaEncadeada<String> lista = new ListaEncadeada<String>();
        lista.add("olá");
        System.out.println(lista.get(0));
        lista.add("Mundo");
        System.out.println(lista);
        lista.remove(1);
        System.out.println(lista);
    }
}
