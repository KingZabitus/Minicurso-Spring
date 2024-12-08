package mp.minicursospring.service;

import mp.minicursospring.model.Usuario;
import mp.minicursospring.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService extends GenericCrud<Usuario, String>{
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    protected UsuarioRepository getRepository() {
        return usuarioRepository;
    }
}
