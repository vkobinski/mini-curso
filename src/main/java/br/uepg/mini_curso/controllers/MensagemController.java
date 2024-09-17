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
        try {
            Mensagem mensagem = repo.getById(id);

            return mensagem.getCorpo() + "\n" + mensagem.getUsuario();
        } catch (Exception e) {
            return "Mensagem não encontrada";
        }
    }

    @PostMapping(path = "/cria", consumes = "application/json")
    public @ResponseBody String criaMensagem(@RequestBody Mensagem mensagem) {
        repo.save(mensagem);
        return mensagem.getCorpo() + "\n" + mensagem.getUsuario();
    }

    @GetMapping(path = "/cria/{mensagem}")
    public @ResponseBody String criaMensagem2(@PathVariable String mensagem) {
        Mensagem nova_mensagem = new Mensagem(mensagem, "");
        repo.save(nova_mensagem);
        return "OK";
    }

}
