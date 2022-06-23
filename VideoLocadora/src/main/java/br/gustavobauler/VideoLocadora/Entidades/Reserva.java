package br.gustavobauler.VideoLocadora.Entidades;

import lombok.Data;
import java.util.ArrayList;
import java.util.Date;
@Data
public class Reserva{
    private int identificador;
    private Date dataReserva;
    private Date dataDevolucao;
    private ArrayList<Filme> filmes;
    private double valorTotal;

    private Cliente cliente;

    public Reserva(int identificador, Date dataReserva, Date dataDevolucao, ArrayList<Filme> filmes, Cliente cliente, double valorTotal) {
        this.identificador = identificador;
        this.dataReserva = dataReserva;
        this.dataDevolucao = dataDevolucao;
        this.filmes = filmes;
        this.cliente = cliente;
        this.valorTotal = valorTotal;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public Date getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(Date dataReserva) {
        this.dataReserva = dataReserva;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public ArrayList<Filme> getFilmes() {
        return filmes;
    }

    public void setFilmes(ArrayList<Filme> filmes) {
        this.filmes = filmes;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
