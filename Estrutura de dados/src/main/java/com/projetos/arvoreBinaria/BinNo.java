package com.projetos.arvoreBinaria;

public class BinNo<T extends Comparable<T>> {

    private T conteudo;
    private BinNo<T> esqNo;
    private BinNo<T> dirNo;

    public BinNo(T conteudo) {
        this.conteudo = conteudo;
        this.esqNo = this.dirNo = null;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public BinNo<T> getEsqNo() {
        return esqNo;
    }

    public void setEsqNo(BinNo<T> esqNo) {
        this.esqNo = esqNo;
    }

    public BinNo<T> getDirNo() {
        return dirNo;
    }

    public void setDirNo(BinNo<T> dirNo) {
        this.dirNo = dirNo;
    }

    @Override
    public String toString() {
        return "BinNo{" +
                "conteudo=" + conteudo +
                '}';
    }
}
