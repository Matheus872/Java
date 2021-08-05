package com.projetos.arvoreBinaria;

public class ArvoreBinaria<T extends Comparable<T>> {

    private BinNo<T> raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public void inserir(T conteudo){
        BinNo<T> novoNo = new BinNo<T>(conteudo);
        this.raiz = inserir(raiz, novoNo);
    }

    private BinNo<T> inserir(BinNo<T> atual, BinNo<T> novoNo){
        if(atual == null){
            return novoNo;
        }else if(novoNo.getConteudo().compareTo(atual.getConteudo()) < 0){
            atual.setEsqNo(inserir(atual.getEsqNo(),novoNo));
        }else{
            atual.setDirNo(inserir(atual.getDirNo(),novoNo));
        }
        return atual;
    }

    public void exibirInOrder(){
        System.out.println("Exibindo árvore binária in-order");
        exibirInOrder(this.raiz);
    }

    private void exibirInOrder(BinNo<T> atual){
        if(atual != null){
            exibirInOrder(atual.getEsqNo());
            System.out.print(atual.getConteudo() + ", ");
            exibirInOrder(atual.getDirNo());
        }

    }

    public void exibirPosOrder(){
        System.out.println("\nExibindo árvore binária in-order");
        exibirPosOrder(this.raiz);
    }

    private void exibirPosOrder(BinNo<T> atual){
        if(atual != null){
            exibirPosOrder(atual.getEsqNo());
            exibirPosOrder(atual.getDirNo());
            System.out.print(atual.getConteudo() + ", ");
        }
    }

    public void exibirPreOrder(){
        System.out.println("\nExibindo árvore binária in-order");
        exibirPreOrder(this.raiz);
    }

    private void exibirPreOrder(BinNo<T> atual){
        if(atual != null){
            System.out.print(atual.getConteudo() + ", ");
            exibirPreOrder(atual.getEsqNo());
            exibirPreOrder(atual.getDirNo());
        }
    }

    public void remove(T conteudo){
        try {
            BinNo<T> atual = this.raiz;
            BinNo<T> pai = null;
            BinNo<T> filho = null;
            BinNo<T> temp = null;

            while(atual != null && !atual.getConteudo().equals(conteudo)){
                pai = atual;
                if(conteudo.compareTo(atual.getConteudo()) < 0){
                    atual = atual.getEsqNo();
                }else
                    atual = atual.getDirNo();
            }

            if(atual == null){
                System.out.println("Conteúdo não encontrado, bloco try.");
            }

            if(pai == null){
                if(atual.getDirNo() == null){
                    this.raiz = atual.getEsqNo();
                }else if(atual.getEsqNo() == null){
                    this.raiz = atual.getDirNo();
                }else{
                    for(temp = atual, filho = atual.getEsqNo();
                        filho.getDirNo() != null;
                        temp = filho, filho = filho.getEsqNo()){
                        if(filho != atual.getEsqNo()){
                            temp.setDirNo(filho.getEsqNo());
                            filho.setEsqNo(raiz.getEsqNo());
                        }
                    }
                    filho.setDirNo(raiz.getDirNo());
                    raiz = filho;
                }
            }else if(atual.getDirNo() == null){
                if(pai.getEsqNo() == atual){
                    pai.setEsqNo(atual.getEsqNo());
                }else{
                    pai.setDirNo(atual.getEsqNo());
                }
            }else if(atual.getEsqNo() == null){
                if(pai.getEsqNo() == atual){
                    pai.setEsqNo(atual.getDirNo());
                }else{
                    pai.setDirNo(atual.getDirNo());
                }
            }else{
                for(temp = atual, filho = atual.getEsqNo();
                    filho.getDirNo() != null;
                    temp = filho, filho = filho.getDirNo()){
                    if(filho != atual.getEsqNo()){
                        temp.setDirNo(filho.getEsqNo());
                        filho.setEsqNo(atual.getEsqNo());
                    }
                    filho.setDirNo(atual.getDirNo());
                    if(pai.getEsqNo() == atual){
                        pai.setEsqNo(filho);
                    }else {
                        pai.setDirNo(filho);
                    }
                }

            }




        }catch (NullPointerException erro){
            System.out.println("Conteúdo não Encontrado, bloco catch.");
        }

    }
}
