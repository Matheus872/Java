package com.projetos.listaEncadeada;

public class ListaEncadeada<T> {

    private No<T> inicio;

    public ListaEncadeada() {
        this.inicio = null;
    }

    public No<T> getInicio() {
        return inicio;
    }

    public void setInicio(No<T> inicio) {
        this.inicio = inicio;
    }

    public boolean isEmpty(){
        return inicio == null;
    }

    public int size() {
        if (inicio == null) {
            return 0;
        } else {
            int tamanhoLista = 1;
            No<T> noAux = inicio;
            while(noAux.getProximo() != null) {
                noAux = noAux.getProximo();
                tamanhoLista++;
            }
            return tamanhoLista;
        }
    }

    public void add(T obj){
        No<T> novoNo = new No<T>(obj);
        if(isEmpty()){
            inicio = novoNo;
        }else{
            No<T> noAux = inicio;
            while(noAux.getProximo() != null){
                noAux = noAux.getProximo();
            }
            noAux.setProximo(novoNo);
        }
    }

    public No<T> getNo(int index){

        validaIndice(index);
        No<T> noAux = inicio;
        for(int i=0;i<index;i++){
            noAux = noAux.getProximo();
        }
        return noAux;
    }

    public T get(int index){
        return getNo(index).getConteudo();
    }


    public T remove(int index){
        No<T> noAlvo = this.getNo(index);
        if (index == 0){
            inicio = noAlvo.getProximo();
        }else{
            No<T> noAnterior = getNo(index - 1);
            noAnterior.setProximo(noAlvo.getProximo());
        }
        return noAlvo.getConteudo();
    }

    public void validaIndice(int index){
        if(index > size()){
            throw new IndexOutOfBoundsException("A lista só possui" + size() + "posições (Indice de 0 a " + (size()-1) +")");
        }
    }

    @Override
    public String toString(){
        if (inicio == null){
            return "Não há elementos na fila";
        }
        No<T> noAux = inicio;
        String stringRetorno = "" + noAux.getConteudo();
        while(noAux.getProximo() != null){
            stringRetorno += noAux.getProximo().getConteudo();
            noAux = noAux.getProximo();
        }
        return noAux == inicio ? inicio.toString() : stringRetorno;
    }

}
