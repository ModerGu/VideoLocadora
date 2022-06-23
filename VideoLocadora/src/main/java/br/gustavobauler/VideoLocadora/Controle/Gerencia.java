package br.gustavobauler.VideoLocadora.Controle;

import br.gustavobauler.VideoLocadora.Entidades.Cliente;
import br.gustavobauler.VideoLocadora.Entidades.Filme;
import br.gustavobauler.VideoLocadora.Entidades.Reserva;

import java.util.ArrayList;

public interface Gerencia{
    public Filme cadastraFilme(Filme f1);
    public ArrayList<Filme> listaFilme();

    public Cliente cadastraCliente(Cliente c1);
    public ArrayList<Cliente> listaCliente();

    public Reserva cadastraReserva(Reserva r1);
    public ArrayList<Reserva> listaReserva();
}
