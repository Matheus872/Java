//        Crie uma classe para representar uma pessoa, com os atributos privados de nome, data de
//        nascimento e altura. Crie os métodos públicos necessários para sets e gets e também um
//        método para imprimir todos dados de uma pessoa. Crie um método para calcular a idade
//        da pessoa

package POO.ex01;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Pessoa {

    private String cpf;
    private String name;
    private LocalDate birthDate;
    private float height;

    public Pessoa(){

    }

    public Pessoa(String cpf, String name, LocalDate birthDate, float height){
        this.cpf = cpf;
        this.name = name;
        this.birthDate = birthDate;
        this.height = height;
    }


    public static void main(String[] args) {
        LocalDate nascimento = LocalDate.of(2008, 05, 19);
        Pessoa matheus = new Pessoa("09876543210", "matheus", nascimento, 1.68f);
        System.out.println("Método calcular idade: " + matheus.calculateAge().toString());
        System.out.println("Método toString: " + matheus.toString());
        matheus.printData();
    }

    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public LocalDate getBirthDate(){
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate){
        this.birthDate = birthDate;
    }

    public float getHeight(){
        return height;
    }

    public void setHeight(float height){
        this.height = height;
    }

    @Override
    public String toString(){
        return "Nome: " + this.name + ", " +
                "Data de Nascimento: " + this.birthDate + ", " +
                "Altura: " + this.height;
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Pessoa){
            Pessoa qualquer = (Pessoa) obj;
            return this.cpf.equals(qualquer.getCpf());
        }else{
            return false;
        }
    }

    public Integer calculateAge(){
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

    public void printData(){
        System.out.println(this.toString());
    }

}
