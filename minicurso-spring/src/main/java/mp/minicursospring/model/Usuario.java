package mp.minicursospring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
public class Usuario {
    @Id
    private String cpf;

    private String nome;
    private String email;
    private LocalDate dataNascimento;

    @ManyToMany(mappedBy = "participantes")
    private List<Evento> eventos;
}
