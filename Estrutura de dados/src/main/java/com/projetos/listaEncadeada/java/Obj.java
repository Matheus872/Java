package com.projetos.listaEncadeada.java;

import java.util.Comparator;
import java.util.Objects;

public class Obj implements Comparable<Obj> {

    private Integer num;

    public Obj(Integer num) {
        this.num = num;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Obj{" +
                "num=" + num +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Obj obj = (Obj) o;
        return Objects.equals(num, obj.num);
    }

    @Override
    public int compareTo(Obj o) {
        if (this.num > o.num){
            return 1;
        }else if (this.num < o.num){
            return -1;
        }
        return 0;
    }
}
