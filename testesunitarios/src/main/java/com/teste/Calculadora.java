package com.teste;

public class Calculadora {

    public int somar(String expressao){
        int soma = 0;
        for(String valorsomar: expressao.split("\\+")){
            soma += Integer.valueOf(valorsomar);
        }
        System.out.println(soma);
        return soma;
    }
}
