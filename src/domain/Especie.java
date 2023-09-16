package domain;

import java.util.List;

public class Especie {

    private Integer cod_especie;
    
    private String nome;

    private List<Animal> animais;

    

    public Especie(Integer cod_especie, String nome) {
        this.cod_especie = cod_especie;
        this.nome = nome;
    }

    public Integer getCod_especie() {
        return cod_especie;
    }

    public void setCod_especie(Integer cod_especie) {
        this.cod_especie = cod_especie;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Animal> getAnimais() {
        return animais;
    }

    public void setAnimais(List<Animal> animais) {
        this.animais = animais;
    }

    @Override
    public String toString() {
        return "Especie [cod_especie=" + cod_especie + ", nome=" + nome + "]";
    }

    
}
