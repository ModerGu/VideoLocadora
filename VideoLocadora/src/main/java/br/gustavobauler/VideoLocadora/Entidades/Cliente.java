package br.gustavobauler.VideoLocadora.Entidades;

import lombok.Data;
import java.util.ArrayList;
@Data
public class Cliente {
    private int identificador;
    private String nome;
    private int idade;
    private double valor;
    private ArrayList <Reserva> listaReservas;

    public Cliente(int identificador, String nome, int idade, double valor, ArrayList<Reserva> listaReservas) {
        this.identificador = identificador;
        this.nome = nome;
        this.idade = idade;
        this.valor = valor;
        this.listaReservas = listaReservas;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public ArrayList<Reserva> getListaReservas() {
        return listaReservas;
    }

    public void setListaReservas(ArrayList<Reserva> listaReservas) {
        this.listaReservas = listaReservas;
    }
}

