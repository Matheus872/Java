package com.projetos.listaCircular;

public class Main {

    public static void main(String[] args) {
        ListaCircular<String> lista = new ListaCircular<String>();

        lista.add("olá");
        lista.add("Mundo");
        lista.add("Nó");
        System.out.println(lista);
        lista.remove(0);
        System.out.println(lista);
        lista.add("Bla");
        System.out.println(lista);
        lista.remove(1);

        lista.add("123");
        System.out.println(lista);

        System.out.println(lista.getNo(2).getProximo());

    }
}
