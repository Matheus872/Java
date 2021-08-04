package com.projetos.nos;

public class Main {

    public static void main(String[] args) {

        No<String> no1 = new No<>("Conteúdo no1");
        No<String> no2 = new No<>("conteúdo no2");
        no1.setProx(no2);

        No<String> no3 = new No<>("conteúdo no3");
        no2.setProx(no3);

        No<String> no4 = new No<>("conteúdo no4");
        no3.setProx(no4);

        System.out.println(no1);
        System.out.println(no1.getProx());
        System.out.println(no1.getProx().getProx());
        System.out.println(no1.getProx().getProx().getProx());
        System.out.println(no1.getProx().getProx().getProx().getProx());

    }

}
