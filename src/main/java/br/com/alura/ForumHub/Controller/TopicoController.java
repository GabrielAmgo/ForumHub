package br.com.alura.ForumHub.Controller;


import br.com.alura.ForumHub.model.Topico;
import br.com.alura.ForumHub.service.TopicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    @Autowired
    private TopicoService topicoService;

    @PostMapping
    public Topico criarTopico(@RequestBody Topico topico) {
        return topicoService.criarTopicos(topico);
    }

    @GetMapping
    public List<Topico> listarTopicos() {
        return topicoService.listarTopicos();
    }
}
