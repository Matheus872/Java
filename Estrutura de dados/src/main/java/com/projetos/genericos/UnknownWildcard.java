package com.projetos.genericos;

import java.util.List;

public class UnknownWildcard {

    public void imprimeLista(List<?> lista) {
        for (Object obj : lista) {
            System.out.println(obj);
        }
    }

//    List<Aluno> minhaLista = new List<Aluno>();
//    imprimeLista(minhaLista);

}
