package mp.minicursospring.controller;

import mp.minicursospring.model.Usuario;
import mp.minicursospring.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/{cpf}")
    public Usuario buscarPorCpf(@PathVariable String cpf){
        return usuarioService.buscarPorId(cpf).orElseThrow(() -> new RuntimeException("Usuário não encontrado!"));
    }

    @PostMapping
    public Usuario salvarUsuario(@RequestBody Usuario usuario){
        return usuarioService.salvar(usuario);
    }

    @DeleteMapping("/{cpf}")
    public void deletarUsuario(@PathVariable String cpf){
        usuarioService.deletarPorId(cpf);
    }
}
