package domain;

import java.util.List;

public class Veterinario {

    private Integer cod_veterinario;

    private String nome;

    private String SCRMV;

    private List<Consulta> consultas;

    public Veterinario(Integer cod_veterinario, String nome, String sCRMV) {
        this.cod_veterinario = cod_veterinario;
        this.nome = nome;
        SCRMV = sCRMV;
    }

    public Integer getCod_veterinario() {
        return cod_veterinario;
    }

    public void setCod_veterinario(Integer cod_veterinario) {
        this.cod_veterinario = cod_veterinario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSCRMV() {
        return SCRMV;
    }

    public void setSCRMV(String sCRMV) {
        SCRMV = sCRMV;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }

    @Override
    public String toString() {
        return "Veterinario [cod_veterinario=" + cod_veterinario + ", nome=" + nome + ", SCRMV=" + SCRMV + "]";
    }
    
    
}
