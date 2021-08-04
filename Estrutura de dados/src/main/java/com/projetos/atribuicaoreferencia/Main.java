package com.projetos.atribuicaoreferencia;

public class Main {

    public static void main(String[] args) {

        int intA = 1;
        int intB = intA;

        System.out.println("intA = " + intA + " intB = " + intB);
        intA = 2;
        System.out.println("intA = " + intA + " intB = " + intB);

        Meuobj objA = new Meuobj(1);
        Meuobj objB = objA;

        System.out.println("intA = " + objA + " intB = " + objB);
        objA.setNum(2);
        System.out.println("intA = " + objA + " intB = " + objB);

    }

}
