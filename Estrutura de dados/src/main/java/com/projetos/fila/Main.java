package com.projetos.fila;

public class Main {

    public static void main(String[] args) {


        Fila<String> fila = new Fila<String>();
        System.out.println(fila);

        fila.enqueue("obj 1");
        System.out.println(fila);

        fila.enqueue("obj 2");
        fila.enqueue("obj 3");
        fila.enqueue("obj 4");
        System.out.println(fila);
        System.out.println("Primeiro: " + fila.first());

        fila.dequeue();
        System.out.println(fila);

        fila.dequeue();
        fila.dequeue();
        System.out.println(fila);

        fila.dequeue();
        System.out.println(fila);

        fila.enqueue("fkamafa");
        System.out.println(fila);



    }

}
