package com.agenda.agenda_contatos.repository;
import com.agenda.agenda_contatos.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository <Usuario, Long>{
    
}
