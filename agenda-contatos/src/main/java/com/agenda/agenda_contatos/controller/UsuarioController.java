package com.agenda.agenda_contatos.controller;

import com.agenda.agenda_contatos.model.Usuario;
import com.agenda.agenda_contatos.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/contatos")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

 
    @GetMapping("/usuarios")
    public String listarUsuarios(Model model) {
        model.addAttribute("usuarios", usuarioRepository.findAll());
        return "lista-usuarios"; 
    }

    
    @GetMapping("/usuarios/novo")
    public String mostrarFormularioCriacao(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "form-usuario";
    }

   
    @PostMapping("/usuarios")
    public String salvarUsuario(@ModelAttribute Usuario usuario) {
        usuarioRepository.save(usuario);
        return "redirect:/usuarios"; 
    }

    @GetMapping("/usuarios/editar/{id}")
    public String mostrarFormularioEdicao(@PathVariable Long id, Model model) {
        model.addAttribute("usuario", usuarioRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Usuário não encontrado: " + id)));
        return "form-usuario"; 
    }

    
    @GetMapping("/usuarios/excluir/{id}")
    public String excluirUsuario(@PathVariable Long id) {
        usuarioRepository.deleteById(id);
        return "redirect:/usuarios"; 
    }
}

