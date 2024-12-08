package mp.minicursospring.controller;

import mp.minicursospring.model.Usuario;
import mp.minicursospring.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/{cpf}")
    public Usuario buscarPorCpf(@PathVariable String cpf){
        return usuarioService.buscarPorId(cpf).orElseThrow(() -> new RuntimeException("Usuário não encontrado!"));
    }
}
