package br.gustavobauler.VideoLocadora.Controle;

import br.gustavobauler.VideoLocadora.Entidades.Cliente;
import br.gustavobauler.VideoLocadora.Entidades.Filme;
import br.gustavobauler.VideoLocadora.Entidades.Reserva;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;

@Service
public class ImplementaGerencia implements Gerencia {

    //Inserindo de forma estática os filmes dentro da lista para listar no method iniciaFilmes
    Filme rfilme = new Filme(1, "007 operação skyfall", 18, "Ação");
    Filme sfilme = new Filme(2, "007 Quantum of Solace", 18, "Ação");
    Filme tfilme = new Filme(3, "007 Contra Spectre", 18, "Ação");
    Filme ufilme = new Filme(4, "007 Sem tempo para morrer", 18, "Ação");
    Filme wfilme = new Filme(5, "007 Cassino Royale", 18, "Ação");

    //criando uma lista de filmes, clientes, reservas.
    ArrayList<Filme> filme = new ArrayList<>(Arrays.asList(rfilme,sfilme,tfilme,ufilme,wfilme));

    //Inserindo de forma estática os clientes dentro da lista para listar no method iniciaCliente
    Cliente rcliente = new Cliente(1, "Gustavo", 23, 250, new ArrayList<Reserva>());
    Cliente scliente = new Cliente(2, "Vitor", 22, 100, new ArrayList<Reserva>());
    Cliente tcliente = new Cliente(3, "James", 18, 50, new ArrayList<Reserva>());
    ArrayList<Cliente> cliente = new ArrayList<>(Arrays.asList(rcliente,scliente,tcliente));

    //Inserindo de forma estática as reservas dentro da lista para listar no method iniciaReserva
    Reserva rreserva = new Reserva(1, new Date(System.currentTimeMillis()), new Date(System.currentTimeMillis()), filme, rcliente, 0);
    Reserva sreserva = new Reserva(2, new Date(System.currentTimeMillis()), new Date(System.currentTimeMillis()), filme, scliente, 0);

    ArrayList<Reserva> reserva = new ArrayList<>(Arrays.asList(rreserva,sreserva));
    public int getLastIdFilme(){
        return filme.size() + 1;
    }

    public int getLastIdCliente(){
        return filme.size() + 1;
    }

    public int getLastIdReserva(){
        return filme.size() + 1;
    }
    @Override
    public Filme cadastraFilme(Filme f1) {
        filme.add(f1);
        return f1;
    }
    @Override
    public ArrayList<Filme> listaFilme() {
        return filme;
    }

    @Override
    public Cliente cadastraCliente(Cliente c1) {
        cliente.add(c1);
        return c1;
    }
    @Override
    public ArrayList<Cliente> listaCliente() {
        return cliente;
    }

    @Override
    public Reserva cadastraReserva(Reserva r1) {
        reserva.add(r1);
        return r1;
    }
    @Override
    public ArrayList<Reserva> listaReserva() {
        return reserva;
    }

    public void iniciaFilmes(){
        filme = new ArrayList<>();
        filme.add(rfilme);
        filme.add(sfilme);
        filme.add(tfilme);
        filme.add(ufilme);
        filme.add(wfilme);
    }

    public void iniciaClientes(){
        cliente = new ArrayList<>();
        cliente.add(rcliente);
        cliente.add(scliente);
        cliente.add(tcliente);
    }

    public void iniciaReservas(){
        reserva = new ArrayList<>();
        reserva.add(rreserva);
        reserva.add(sreserva);
    }
}
