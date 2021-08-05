package com.projetos.listaEncadeada.java;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_HashSet_TreeSet {

    public static void main(String[] args) {

        Set<Obj> conjunto = new HashSet<>();

        System.out.println("Conjunto HashSet");
        conjunto.add(new Obj(15));
        conjunto.add(new Obj(10));
        conjunto.add(new Obj(5));
        conjunto.add(new Obj(0));
        conjunto.add(new Obj(20));
        conjunto.add(new Obj(25));

        System.out.println(conjunto + "\n");

        System.out.println("Conjunto TreeSet");
        Set<Obj> conjuntoArvore = new TreeSet<>();
        conjuntoArvore.add(new Obj(10));
        conjuntoArvore.add(new Obj(0));
        conjuntoArvore.add(new Obj(20));
        conjuntoArvore.add(new Obj(5));
        conjuntoArvore.add(new Obj(15));

        System.out.println(conjuntoArvore);

    }

}
