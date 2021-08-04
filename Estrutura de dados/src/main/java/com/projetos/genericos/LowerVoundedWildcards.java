package com.projetos.genericos;

import java.util.List;

public class LowerVoundedWildcards {
    public void imprimeLista(List<? super Pessoa> listaPessoas){ //Aceita Pessoa e classes pai de Pessoa
        for (Object obj : listaPessoas) {
            System.out.println(obj);
        }
    }

//    List<Aluno> minhaLista = new List<Aluno>();
//    imprimeLista(minhaLista);
}
