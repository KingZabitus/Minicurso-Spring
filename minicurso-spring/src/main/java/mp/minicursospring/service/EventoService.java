package mp.minicursospring.service;

import mp.minicursospring.model.Evento;
import mp.minicursospring.repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventoService extends GenericCrud<Evento, Integer> {
    @Autowired
    private EventoRepository eventoRepository;

    @Override
    protected EventoRepository getRepository(){
        return eventoRepository;
    }
}
