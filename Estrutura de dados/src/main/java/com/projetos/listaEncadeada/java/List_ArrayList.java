package com.projetos.listaEncadeada.java;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class List_ArrayList {

    public static void main(String[] args) {
         List<Obj> lista = new ArrayList<>();

        System.out.println(lista.isEmpty());
        lista.add(new Obj(15));
        System.out.println(lista.get(0));
        lista.add(new Obj(2));
        lista.add(new Obj(5));
        lista.sort(Comparator.comparingInt(Obj::getNum));
        System.out.println(lista);
        System.out.println(lista.indexOf(new Obj(15)));
        lista.remove(new Obj(15));
        System.out.println(lista);
    }

}
