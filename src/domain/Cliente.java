package domain;

import java.util.List;

public class Cliente {

    private Integer cod_cliente;

    private String nome;

    private String endereco;

    private String telefone;

    private List<Animal> animais;

    public Cliente(Integer cod_cliente, String nome, String endereco, String telefone) {
        this.cod_cliente = cod_cliente;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public Integer getCod_cliente() {
        return cod_cliente;
    }

    public void setCod_cliente(Integer cod_cliente) {
        this.cod_cliente = cod_cliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<Animal> getAnimais() {
        return animais;
    }

    public void setAnimais(List<Animal> animais) {
        this.animais = animais;
    }


    @Override
    public String toString() {
        return "Cliente [cod_cliente=" + cod_cliente + ", nome=" + nome + ", endereco=" + endereco + ", telefone="
                + telefone +  "]";
    }
}
