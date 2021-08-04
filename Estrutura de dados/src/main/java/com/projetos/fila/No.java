package com.projetos.fila;

public class No<T> {

    private T object;
    private No proixmo;

    public No(T object) {
        this.object = object;
    }

    public No() {
        setProixmo(null);
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }


    public No<T> getProixmo() {
        return proixmo;
    }

    public void setProixmo(No<T> proixmo) {
        this.proixmo = proixmo;
    }

    @Override
    public String toString() {
        return "No{" +
                "object=" + object +
                '}';
    }
}
