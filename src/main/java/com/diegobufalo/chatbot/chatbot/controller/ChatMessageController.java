package com.diegobufalo.chatbot.chatbot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.diegobufalo.chatbot.chatbot.dto.MensagemDTO;
import com.diegobufalo.chatbot.chatbot.model.Atendimento;
import com.diegobufalo.chatbot.chatbot.model.ChatMessage;
import com.diegobufalo.chatbot.chatbot.service.AtendimentoService;
import com.diegobufalo.chatbot.chatbot.service.ChatMessageService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("chat")
public class ChatMessageController {

    @Autowired
    private ChatMessageService chatService;
  
    @Autowired
    private AtendimentoService atendimentoService;

    @GetMapping
    public Mono<ChatMessage> resposta() {
        return chatService.buscaApresentacao();
    }

    @PostMapping("conversa")
    public Mono<ChatMessage> resposta(@RequestBody MensagemDTO palavra) {
        String messagem = palavra.getMensagem();
        return chatService.buscarResposta(messagem);
    }
    
    @GetMapping("novoAtendimento")
    @ResponseStatus(value = HttpStatus.CREATED)
    public Mono<Atendimento> novoAtendimento() {
        return atendimentoService.novoAtendimento();
    }
    
   	@PutMapping("atendimento")
    public Mono<Atendimento> respostaIndexada(@RequestBody Atendimento atendimento) {
        return atendimentoService.respostasAtendimento(atendimento);
    }
   	
   	@GetMapping(path = "usuario/{id}")
    public Flux<Atendimento> buscarAtendimentosUsuario(@PathVariable Integer id ) {
        return atendimentoService.buscaAtendimentosUsuario(id);
    }
   	@GetMapping(path = "usuario/atendimento/{id}")
    public Mono<Atendimento> BuscarAtendimento(@PathVariable Integer id ) {
        return atendimentoService.buscaAtendimentos(id);
    }
}
