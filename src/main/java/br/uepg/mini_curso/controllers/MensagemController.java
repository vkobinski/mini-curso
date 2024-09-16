package br.uepg.mini_curso.controllers;

import br.uepg.mini_curso.models.Mensagem;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("mensagem")
public class MensagemController {

    @GetMapping(name = "/{id}", produces = "application/json")
    public @ResponseBody Mensagem getMensagem(@PathVariable Long id) {
        return new Mensagem();
    }

}
