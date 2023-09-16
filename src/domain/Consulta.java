package domain;

import java.util.Date;
import java.util.List;

public class Consulta {
    
    private Integer cod_consulta;

    private Date data;

    private Veterinario veterinario;

    private String resumo;

    private Tratamento tratamento;

    private List<Exame> Exames;

    public Consulta(Integer cod_consulta, Date data, Veterinario veterinario, String resumo, Tratamento tratamento) {
        this.cod_consulta = cod_consulta;
        this.data = data;
        this.veterinario = veterinario;
        this.resumo = resumo;
        this.tratamento = tratamento;
    }
    public Integer getCod_consulta() {
        return cod_consulta;
    }

    public void setCod_consulta(Integer cod_consulta) {
        this.cod_consulta = cod_consulta;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }
    public Tratamento getTratamento() {
        return tratamento;
    }
    public void setTratamento(Tratamento tratamento) {
        this.tratamento = tratamento;
    }

     public List<Exame> getExames() {
        return Exames;
    }
    public void setExames(List<Exame> exames) {
        Exames = exames;
    }

  
    @Override
    public String toString() {
        return "Consulta [cod_consulta=" + cod_consulta + ", data=" + data + ", veterinario=" + veterinario
                + ", resumo=" + resumo + ", tratamento=" + tratamento + "]";
    }
   

    
}
