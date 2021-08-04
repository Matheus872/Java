package com.projetos.fila;

public class Fila<T> {

    private No<T> inicio;

    public Fila() {
        this.inicio = null;
    }

    public void enqueue(T obj){
        No<T> novoNo = new No<T>(obj);
        if(isEmpty()){
            inicio = novoNo;
        }else{
            No noAux = inicio;
            while(noAux.getProixmo() != null){
                noAux = noAux.getProixmo();
            }
            noAux.setProixmo(novoNo);
        }
    }

    public T dequeue() {
        if (!isEmpty()) {
            No noAux;
            noAux = inicio;
            inicio = inicio.getProixmo();
            return (T) noAux.getObject();
        }
        return null;
    }

    public Object first(){
        if(!isEmpty()){
            return inicio;
        }
        return null;
    }

    public boolean isEmpty(){ return inicio == null; }

    @Override
    public String toString(){
        if (inicio == null){
            return "Não há elementos na fila";
        }
        No noAux = inicio;
        String stringRetorno = "" + noAux.getObject();
        while(noAux.getProixmo() != null){
            stringRetorno += noAux.getProixmo().getObject();
            noAux = noAux.getProixmo();
        }
        return noAux == inicio ? inicio.toString() : stringRetorno;
    }
}
