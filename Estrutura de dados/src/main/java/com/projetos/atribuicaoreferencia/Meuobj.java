package com.projetos.atribuicaoreferencia;

public class Meuobj {

    private Integer num;

    public Meuobj(Integer num) {
        this.num = num;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public String toString(){
        return this.num.toString();
    }
}

