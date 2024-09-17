package br.uepg.mini_curso.controllers;

import br.uepg.mini_curso.models.Mensagem;
import br.uepg.mini_curso.repository.MensagemRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/mensagem")
public class MensagemController {

    private final MensagemRepository repo;

    public MensagemController(MensagemRepository repo) {
        this.repo = repo;
    }

    @GetMapping(path = "/{id}")
    public @ResponseBody String getMensagem(@PathVariable Long id) {
        return repo.getById(id).getCorpo();
    }

    @PostMapping(path = "/cria")
    public @ResponseBody String criaMensagem(@RequestBody String mensagem) {
        Mensagem nova_mensagem = new Mensagem(mensagem);
        repo.save(nova_mensagem);
        return "OK";
    }

}
