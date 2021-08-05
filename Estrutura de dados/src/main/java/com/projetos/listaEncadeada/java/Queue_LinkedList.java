package com.projetos.listaEncadeada.java;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_LinkedList {

    public static void main(String[] args) {
        Queue<Obj> fila = new LinkedList<>();

        fila.add(new Obj(10));
        fila.add(new Obj(20));
        fila.add(new Obj(30));
        System.out.println(fila);
        System.out.println(fila.poll()); // Retorna 1º elemento e remove, pode retornar NULL se a fila estiver vazia
        System.out.println(fila.peek()); // Retorna 1º elemento sem remover, pode retornar NULL se a fila estiver vazia
        System.out.println(fila);
    }

}
