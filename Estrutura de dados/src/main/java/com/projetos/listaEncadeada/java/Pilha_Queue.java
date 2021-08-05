package com.projetos.listaEncadeada.java;

import java.util.Stack;

public class Pilha_Queue {

    public static void main(String[] args) {
        Stack<Obj> pilha = new Stack<>();

        System.out.println(pilha.empty());
        pilha.push(new Obj(5));
        pilha.push(new Obj(6));
        pilha.push(new Obj(7));
        pilha.push(new Obj(8));
        System.out.println(pilha);
        pilha.pop();
        System.out.println(pilha);
        System.out.println(pilha.peek());
    }

}
