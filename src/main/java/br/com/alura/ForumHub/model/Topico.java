package br.com.alura.ForumHub.model;

import br.com.alura.ForumHub.usuario.Usuario;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensagem;

    @ManyToOne
    private Usuario autor;

    @ManyToOne
    private Curso curso;
}