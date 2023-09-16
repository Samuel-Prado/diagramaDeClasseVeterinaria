package domain;

import java.util.Date;

public class Exame {

    private Date data;

    private String tipo;

    private String resultados;

    private Integer cod_consulta;

    private Consulta consulta;

    public Exame(Date data, String tipo, String resultados, Integer cod_consulta, Consulta consulta) {
        this.data = data;
        this.tipo = tipo;
        this.resultados = resultados;
        this.cod_consulta = cod_consulta;
        this.consulta = consulta;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getResultados() {
        return resultados;
    }

    public void setResultados(String resultados) {
        this.resultados = resultados;
    }

    public Integer getCod_consulta() {
        return cod_consulta;
    }

    @Override
    public String toString() {
        return "Exame [data=" + data + ", tipo=" + tipo + ", resultados=" + resultados + ", cod_consulta="
                + cod_consulta + ", consulta=" + consulta + "]";
    }

    public void setCod_consulta(Integer cod_consulta) {
        this.cod_consulta = cod_consulta;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    
}
