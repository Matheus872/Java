package com.projetos.genericos;


import java.util.List;

public class UpperBoundedWildcards {

    public void imprimeLista(List<? extends Pessoa> listaPessoas){
        for (Object obj : listaPessoas) {
            System.out.println(obj);
        }
    }

//    List<Aluno> minhaLista = new List<Aluno>();
//    imprimeLista(minhaLista);


}
