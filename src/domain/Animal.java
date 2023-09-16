package domain;

import java.util.List;

public class Animal {

    private Integer cod_animal;

    private String nome;

    private String sexo;

    private String idade;

    private Cliente cliente;

    private Especie especie;

    private List<Tratamento> tratamentos;

    public Animal(Integer cod_animal, String nome, String sexo, String idade, Cliente cliente, Especie especie) {
        this.cod_animal = cod_animal;
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.cliente = cliente;
        this.especie = especie;
    }

    public Integer getCod_animal() {
        return cod_animal;
    }

    public void setCod_animal(Integer cod_animal) {
        this.cod_animal = cod_animal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    public List<Tratamento> getTratamentos() {
        return tratamentos;
    }

    public void setTratamentos(List<Tratamento> tratamentos) {
        this.tratamentos = tratamentos;
    }
    
    @Override
    public String toString() {
        return "Animal [cod_animal=" + cod_animal + ", nome=" + nome + ", sexo=" + sexo + ", idade=" + idade
                + ", cliente=" + cliente + ", especie=" + especie + "]";
    }

    
}
