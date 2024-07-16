package br.com.alura.ForumHub.service;

import br.com.alura.ForumHub.model.Topico;
import br.com.alura.ForumHub.model.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicoService {

    @Autowired
    private TopicoRepository topicoRepository;

    public void criarTopico(Topico topico) {
    }

    public List<Topico> listarTopicos() {
        return null;
    }

    public Topico criarTopicos(Topico topico) {
        return topico;
    }
}