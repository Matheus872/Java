
/*

Crie uma classe chamada HeartRates. Os atributos da classe devem incluir o nome, sobrenome e data de nascimento da
pessoa (consistindo em atributos separados para mês, dia e ano de nascimento). Sua classe deve ter um construtor
que receba esses dados como parâmetros. Para cada atributo forneça métodos set e get. A classe também deve
incluir um método que calcule e retorne a idade (em anos), um que calcule e retorne a frequência cardíaca máxima
e um que calcule e retorne a frequência cardíaca alvo da pessoa. Escreva um aplicativo Java que solicite as
informações da pessoa, instancie um objeto da classe HeartRates e imprima as informações a partir desse objeto
— incluindo nome, sobrenome e data de nascimento da pessoa — calcule e imprima a idade da pessoa (em anos), seu
intervalo de frequência cardíaca máxima e sua frequência cardíaca alvo.

*/

package Basico.Ex08;

import java.time.LocalDate;
import java.time.Period;

public class HeartRates {
    private String nome;
    private String sobreNome;
    private Integer dia;
    private Integer mes;
    private Integer ano;


    public HeartRates(String nome, String sobreNome, Integer dia, Integer mes, Integer ano){
        this.setNome(nome);
        this.setSobreNome(sobreNome);
        this.setDia(dia);
        this.setMes(mes);
        this.setAno(ano);

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        this.dia = dia;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Integer calculaIdadeEmAnos(){
        LocalDate nascimento =  LocalDate.of(this.getAno(), this.getMes(), this.getDia());
        return Period.between(nascimento, LocalDate.now()).getYears();
    }

    public Integer calculaFrequenciaCardiacaMaxima(Integer idade){
        return 220 - idade;
    }

    public Float calculaFrequenciaCardiacaAlvo(Integer frequencia){
        return frequencia * 0.7f;
    }

    @Override
    public String toString(){
        return "Nome: " + this.nome + "\n" +
                "Sobrenome:" + this.sobreNome + "\n" +
                "Data de nascimento: "+ this.dia + "/" +
                                        this.mes + "/" +
                                        this.ano;
    }


}
