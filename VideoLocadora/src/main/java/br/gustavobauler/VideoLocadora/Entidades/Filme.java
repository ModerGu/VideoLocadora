package br.gustavobauler.VideoLocadora.Entidades;

import lombok.Data;

@Data
public class Filme {
    private int identificador;
    private String texto;
    private int classificacao;
    private String genero;

    public Filme(int identificador, String texto, int classificacao, String genero) {
        this.identificador = identificador;
        this.texto = texto;
        this.classificacao = classificacao;
        this.genero = genero;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
