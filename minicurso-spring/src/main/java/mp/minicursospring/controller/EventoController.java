package mp.minicursospring.controller;


import mp.minicursospring.model.Evento;
import mp.minicursospring.service.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/eventos")
public class EventoController {

    @Autowired
    private EventoService eventoService;
    @GetMapping
    public List<Evento> listarEventos() {
        return eventoService.listar();
    }

    @GetMapping("/{codigo}")
    public Evento buscarPorCodigo(@PathVariable int codigo) {
        return eventoService.buscarPorId(codigo).orElseThrow(() -> new RuntimeException("Evento não encontrado!"));
    }

    @PostMapping
    public Evento salvarEvento(@RequestBody Evento evento) {
        return eventoService.salvar(evento);
    }

    @DeleteMapping("/{codigo}")
    public void deletarEvento(@PathVariable int codigo) {
        eventoService.deletarPorId(codigo);
    }

}
