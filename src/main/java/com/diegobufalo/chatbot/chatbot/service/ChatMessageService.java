package com.diegobufalo.chatbot.chatbot.service;

import com.diegobufalo.chatbot.chatbot.model.ChatMessage;
import com.diegobufalo.chatbot.chatbot.repository.ChatMessageRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Mono;

@Service
public class ChatMessageService {

    @Autowired
    private ChatMessageRepository chatRepository;

    public Mono<ChatMessage> buscarResposta(String palavra){
        Mono<ChatMessage> mensagemEncontrada = chatRepository
                .findByMensagemContainingIgnoringCase(palavra);
        return mensagemEncontrada
                .defaultIfEmpty(new ChatMessage(2, "Desculpe nao entendi sua pergunta"));
    }

    public Mono<ChatMessage> buscaApresentacao() {
        Mono<ChatMessage> mensagemEncontrada = chatRepository.findById(1);
        return mensagemEncontrada;
    }
}