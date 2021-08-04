package com.projetos.pilha;

public class Pilha {

    private No noTopo;

    public Pilha() {
        this.noTopo = null;
    }

    public No top(){
        return noTopo;
    }

    public void push(No novoNo){
        No refAux = noTopo;
        noTopo = novoNo;
        novoNo.setRefNo(refAux);
    }

    public No pop(){
        if(isEmpity()){
            return null;
        }else{
            No noPopped = noTopo;
            noTopo = noTopo.getRefNo();
            return noPopped;
        }
    }


    public  boolean isEmpity(){
        return noTopo == null;
    }

    @Override
    public String toString() {
        No noAux = noTopo;
        String stringRetorno = "";
        while (true){
            if(noAux != null){
                stringRetorno += noAux.getDado();
                noAux = noAux.getRefNo();
            }else{
                break;
            }
        }
        return stringRetorno;
    }
}
