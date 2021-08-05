package com.projetos.listaEncadeada.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Map_HashMap {

    public static void main(String[] args) {

        Map<String, String> aluno = new HashMap<>();
        aluno.put("Nome", "Jõao");
        aluno.put("Matrícula", "1822082032");
        aluno.put("Média", "9");
        System.out.println(aluno);

        Map<String, String> aluno2 = new HashMap<>();
        aluno2.put("Nome", "Matheus");
        aluno2.put("Matrícula", "123456789");
        aluno2.put("Média", "20");
        System.out.println(aluno2);

        List<Map<String, String>> alunos = new ArrayList<>();
        alunos.add(aluno);
        alunos.add(aluno2);
        System.out.println("Lista de Map");
        System.out.println(alunos);

    }

}
