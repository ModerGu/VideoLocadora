package br.gustavobauler.VideoLocadora.Controle;

import br.gustavobauler.VideoLocadora.Entidades.Cliente;
import br.gustavobauler.VideoLocadora.Entidades.Filme;
import br.gustavobauler.VideoLocadora.Entidades.Reserva;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*")
public class Run {
    @Autowired
    ImplementaGerencia gerencia;

    @GetMapping("/")
    @ResponseBody
    public String hello() {
        return "Hello World!!!!!";
    }

    @PostMapping("/filme")
    @ResponseBody
    public Filme cadastraFilme(@RequestBody Filme f1) {
        f1.setIdentificador(gerencia.getLastIdFilme());
        return gerencia.cadastraFilme(f1);
    }
    @GetMapping("/listaFilme")
    public ArrayList<Filme> listaFilme() {
        return gerencia.listaFilme();
    }

    @PostMapping("/cliente")
    public Cliente cadastraCliente(@RequestBody Cliente c1) {
        c1.setIdentificador(gerencia.getLastIdCliente());
        return gerencia.cadastraCliente(c1);
    }
    @GetMapping("/listaCliente")
    public ArrayList<Cliente> listaCliente() {
        return gerencia.listaCliente();
    }

    @PostMapping("/reserva")
    public Reserva cadastraReserva(@RequestBody Reserva r1) {
        r1.setIdentificador(gerencia.getLastIdReserva());
        return gerencia.cadastraReserva(r1);
    }
    @GetMapping("/listaReserva")
    public ArrayList<Reserva> listaReserva() {
        return gerencia.listaReserva();
    }
}
