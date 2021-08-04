package com.projetos.listaCircular;

public class ListaCircular<T> {

    private No<T> inicio;
    private No<T> fim;
    private int tamanhoLista;

    public ListaCircular() {
        this.setInicio(null);
        this.fim = null;
        this.tamanhoLista = 0;
    }

    public No<T> getInicio() {
        return inicio;
    }

    public void setInicio(No<T> inicio) {
        this.inicio = inicio;
    }

    public No<T> getFim(){ return fim; }

    public void setFim(No<T> fim) { this.fim = fim; }

    public int getTamanhoLista() {
        return tamanhoLista;
    }

    public void setTamanhoLista(int tamanhoLista) {
        this.tamanhoLista = tamanhoLista;
    }

    public int size(){ return this.tamanhoLista; }

    public boolean isEmpty(){ return size() == 0; }

    public void add(T obj){
        No<T> novoNo = new No<T>(obj);
        if(isEmpty()){
            setInicio(novoNo);
            setFim(novoNo);
            fim.setProximo(inicio);

        }else{
            novoNo.setProximo(inicio);
            fim.setProximo(novoNo);
            inicio = novoNo;

        }
        tamanhoLista++;
    }

    public No<T> getNo(int index){
        if(isEmpty()){
            throw new IndexOutOfBoundsException("A lista não contém nenhum elemento");
        }
        if (index == 0) {
            return this.inicio;
        }
        validaIndice(index);
        No<T> noAux = getInicio();
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
        No<T> noAux = inicio;
        if(index >= size()){
            throw new IndexOutOfBoundsException("O índice passado é maior que a lista");
        }
        if (index == 0){
            setInicio(inicio.getProximo());
        }else if(index == 1){
            inicio.setProximo(inicio.getProximo().getProximo());
        }else{
            for (int i=0;i<index-1;i++){
                noAux = noAux.getProximo();
            }
            noAux.setProximo(noAux.getProximo().getProximo());
        }
        this.tamanhoLista--;
        return noAlvo.getConteudo();
    }

    public void validaIndice(int index){
        if(index > size()){
            throw new IndexOutOfBoundsException("A lista só possui" + size() + "posições (Indice de 0 a " + (size()-1) +")");
        }
    }

    @Override
    public String toString(){
        if (getInicio() == null){
            return "Não há elementos na fila";
        }
        No<T> noAux = getInicio();
        String stringRetorno = "" + noAux.getConteudo();
        for(int i=0;i<size()-1;i++){
            stringRetorno += noAux.getProximo().getConteudo();
            noAux = noAux.getProximo();
        }
        return stringRetorno;
    }


}
