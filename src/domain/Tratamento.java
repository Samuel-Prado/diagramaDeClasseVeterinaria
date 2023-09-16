package domain;

import java.util.List;

public class Tratamento {

    private Integer cod_tratamento;

    private Animal animal;

    private String descricao;

    private List<Consulta> consultas;

    public Tratamento(Integer cod_tratamento, Animal animal, String descricao) {
        this.cod_tratamento = cod_tratamento;
        this.animal = animal;
        this.descricao = descricao;
    }

    public Integer getCod_tratamento() {
        return cod_tratamento;
    }

    public void setCod_tratamento(Integer cod_tratamento) {
        this.cod_tratamento = cod_tratamento;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

      public List<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }


    @Override
    public String toString() {
        return "Tratamento [cod_tratamento=" + cod_tratamento + ", animal=" + animal + ", descricao=" + descricao + "]";
    }

  
}
