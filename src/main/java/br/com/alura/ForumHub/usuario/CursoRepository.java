package br.com.alura.ForumHub.usuario;

import br.com.alura.ForumHub.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {
}
